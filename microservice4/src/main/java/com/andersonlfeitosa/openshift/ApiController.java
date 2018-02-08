package com.andersonlfeitosa.openshift;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ApiController {

  @Autowired
  private EurekaClient discoveryClient;

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  public RestTemplate createRestTemplate() {
    return new RestTemplate();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/")
  public String sayHello() {
    return this.restTemplate.getForObject(URI.create(serviceUrl()), String.class);
  }

  public String serviceUrl() {
    InstanceInfo instance = discoveryClient.getNextServerFromEureka("ms1", false);
    return instance.getHomePageUrl();
  }

}
