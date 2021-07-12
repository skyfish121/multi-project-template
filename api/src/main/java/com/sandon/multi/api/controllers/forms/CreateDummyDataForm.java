package com.sandon.multi.api.controllers.forms;

import com.sandon.multi.api.repository.Dummy;
import lombok.Value;

@Value
public class CreateDummyDataForm {

  private String value;

  public Dummy toDummy() {
    return new Dummy(value);
  }
}
