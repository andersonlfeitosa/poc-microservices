package com.andersonlfeitosa.openshift;

import java.net.InetAddress;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/")
  public String sayHello() throws Exception {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello World<br>");
    sb.append("IP: ");
    sb.append(InetAddress.getLocalHost());
    sb.append("<br>");
    sb.append("Date: ");
    sb.append(new Date());
    sb.append("<br>");
    sb.append("Version: 2.0");

    return sb.toString();
  }

}
