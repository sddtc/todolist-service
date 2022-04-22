package sddtc.todolistservice.model;

import java.io.Serializable;
import java.time.Instant;

public class TodoEvent{
  String category;
  String content;
  Instant createdAt;

  public TodoEvent(String category, String content) {
    this.category = category;
    this.content = content;
    this.createdAt = Instant.now();
  }

  public String getCategory() {
    return category;
  }

  public String getContent() {
    return content;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  @Override
  public String toString() {
    return "TodoEvent{" +
        "category='" + category + '\'' +
        ", content='" + content + '\'' +
        ", createdAt=" + createdAt +
        '}';
  }
}
