package com.sandon.multi.api.controllers.forms;

import com.sandon.multi.api.domain.Dummy;
import lombok.Value;

@Value
public class CreateDummyDataForm {

  private String value;

  public Dummy toDummy() {
    return new Dummy(value);
  }
}
