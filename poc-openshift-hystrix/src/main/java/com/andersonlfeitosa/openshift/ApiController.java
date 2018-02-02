package com.andersonlfeitosa.openshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  @Autowired
  private HystrixService hystrix;

  @RequestMapping("poc-hystrix")
  public String sayHello() {
    return hystrix.readingList();
  }

}
