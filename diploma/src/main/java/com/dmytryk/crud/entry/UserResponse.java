package com.dmytryk.crud.entry;

import lombok.Data;

@Data
public class UserResponse {

  String content;

  public UserResponse() {
  }

  public UserResponse(String content) {
    this.content = content;
  }
}
