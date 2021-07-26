package com.sandon.multi.api.controller;

import com.sandon.multi.api.controller.form.ReserveMngForm;
import com.sandon.multi.api.service.ReserveMngService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ReserveMngController {

  private final ReserveMngService reserveMngService;

  @GetMapping(value = "/reserve/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ReserveMngForm select(@PathVariable("id") Long id) {
    return reserveMngService.select(id);
  }

  @PostMapping(value = "/reserve", produces = MediaType.APPLICATION_JSON_VALUE)
  public ReserveMngForm create(@RequestBody ReserveMngForm reserveMngForm) {
    BeanUtils.copyProperties(reserveMngService.insert(reserveMngForm), reserveMngForm);
    return reserveMngForm;
  }
}
