package br.com.danieleleao.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import at.favre.lib.crypto.bcrypt.BCrypt;


/*Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
   @Autowired
    private IUserRepository userRepository;

    // Criar novo usuário
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());
        System.out.println(user);
        if(user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("usuario já existe");
        }

        var passwordHashred = BCrypt.withDefaults().hashToString( 12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);

    }

    // Listar todos os usuários (opcional para testar)
   
  
}
