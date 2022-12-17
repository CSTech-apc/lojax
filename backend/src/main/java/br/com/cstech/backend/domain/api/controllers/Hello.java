package br.com.cstech.backend.domain.api.controllers;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Hello {

  @GetMapping(path = "/")
  public String hello() {
    return "Hello World " + new Date();
  }
}
