package com.sandon.multi.api.controllers;

import com.sandon.multi.api.domain.InvalidDummmyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SharedExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler({
      InvalidDummmyException.class
  })
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public void handleBadRequestExceptions() {
  }

}
