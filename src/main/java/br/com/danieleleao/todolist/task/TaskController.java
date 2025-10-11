package br.com.danieleleao.todolist.task;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/tasks")
public class TaskController {
  @Autowired
  private ITaskRepository taskRepository;
  
  @PostMapping("/")
  public TaskModel create(@RequestBody TaskModel taskModel, HttpServletRequest request){
    var idUser = request.getAttribute("idUser");
    taskModel.setId((UUID)idUser);
    var task = this.taskRepository.save(taskModel);
    System.out.println("chegou no controller:  " + request.getAttribute("idUser"));
    return task;

  }
  
}
