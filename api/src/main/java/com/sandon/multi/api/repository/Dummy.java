package com.sandon.multi.api.repository;

import lombok.Value;

@Value
public class Dummy {

  private Long id;

  private String value;

  public Dummy() {
    this.id = null;
    this.value = null;
    // Default constructor is required for JPA
  }

  public Dummy(String value) {
    this.id = null;
    this.value = value;
  }
}
