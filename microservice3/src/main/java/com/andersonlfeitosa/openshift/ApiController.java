package com.andersonlfeitosa.openshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("poc-ms3")
    public String sayHello(){
      return ("Hello, SpringBoot on Wildfly at OpenShift");
    }

}
