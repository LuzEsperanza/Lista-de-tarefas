# 📝 To-Do List (Lista de Tarefas)
Aplicação simples que cadastra de tarefas desenvolvida em **Java** com **Spring Boot**, utilizando o **Visual Studio Code** como ambiente de desenvolvimento.
---
## 🚀 Tecnologias utilizadas
- **Java 17+**
- **Spring Boot**
- **Maven**
- **H2** 
- **Insomnia** (para testar as requisições REST)
- **Visual Studio Code**
- **Docker 🐳**
---
## ⚙️ Funcionalidades
- Criar usuário 
- Criar tarefas
- Listar tarefas
- Editar tarefa

---

## 🔧 Como executar o projeto

1. **Clonar o repositório**
---
2.**Instalar dependências**
   ```bash
   mvn clean install
```
---

3.**Rodar a aplicação**
  ```bash
  mvn spring-boot:run
```
---

4.**Acessar o servidor**
http://localhost:8080
---
## 🧠 Endpoints da API

| Método | Endpoint            | Descrição                 |
|---------|--------------------|---------------------------|
| POST    | `/users/`          | Cria uma usuário          |
| POST    | `/tasks/`          | Cria uma tarefas          |
| GET     | `/tasks/`          | Listar tarefas            |
| PUT     | `/tasks/idDetarefa`| Editar tarefa             |
---
## 📋 Exemplo de JSON para criar uma tarefa

```json
{
  "description" : "tarefa denhar para palestra",
	"title": "desenhar circulo",
	"priority": "ALTA",
	"startAt": "2025-09-30T17:30:00",
	"endAt": "2025-09-30T00:00:00",
	"idUser": "10b2126e-d8ee-4a45-a1b3-595caa5663dd"
}
```
---
## 👩‍💻 Autor

**Luz Apolo**  
📧 [luzdeesperanzaapolo@gmail.com](mailto:luzdeesperanzaapolo@gmail.com)  






