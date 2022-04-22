package sddtc.todolistservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sddtc.todolistservice.model.PostTodoRequestDTO;
import sddtc.todolistservice.model.TodoEvent;

@RestController
public class TodolistController {

  @PostMapping(value = "/todo")
  public ResponseEntity<TodoEvent> postTodo(@RequestBody PostTodoRequestDTO requestDTO) {
    return ResponseEntity.ok(new TodoEvent(requestDTO.getCategory(), requestDTO.getContent()));
  }
}
