package sddtc.todolistservice.model;

import java.time.Instant;

public class PostTodoRequestDTO {
  String category;
  String content;

  public PostTodoRequestDTO(String category, String content) {
    this.category = category;
    this.content = content;
  }

  public String getCategory() {
    return category;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return "PostTodoRequestDTO{" +
        "category='" + category + '\'' +
        ", content='" + content + '\'' +
        '}';
  }
}
