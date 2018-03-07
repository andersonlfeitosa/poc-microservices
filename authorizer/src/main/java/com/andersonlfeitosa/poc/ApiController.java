package com.andersonlfeitosa.poc;

import java.net.InetAddress;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  private static final String VERSION = "1.0.0";

  @GetMapping("/")
  public Authorization sayHello() throws Exception {
    return new Authorization(UUID.randomUUID().toString(), InetAddress.getLocalHost().toString(), VERSION, new Date());
  }

}
