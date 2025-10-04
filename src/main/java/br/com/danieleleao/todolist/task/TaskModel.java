package br.com.danieleleao.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
@Data
@Entity(name = "Tb_Tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String description;

  @Column(length =50)
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;
  
  @CreationTimestamp
  private LocalDateTime createdAt;

  private UUID idUser;

}
