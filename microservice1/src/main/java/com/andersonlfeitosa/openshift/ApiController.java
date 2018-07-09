package com.andersonlfeitosa.openshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class ApiController {

  @Value(value = "${nome:erro}")
  private String nome;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String sayHello() {
    return nome;
  }

}
