package com.andersonlfeitosa.poc;

import java.net.InetAddress;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  // @GetMapping("/")
  // public String sayHello() throws Exception {
  // return UUID.randomUUID().toString() + " - " + InetAddress.getLocalHost() + "
  // - Date: " + new Date()
  // + " - Version: 1.0.0";
  // }

  @GetMapping("/")
  public Authorization sayHello() throws Exception {
    return new Authorization(UUID.randomUUID().toString(), InetAddress.getLocalHost().getHostName(),
        InetAddress.getLocalHost().getHostAddress(), new Date());
  }

}
