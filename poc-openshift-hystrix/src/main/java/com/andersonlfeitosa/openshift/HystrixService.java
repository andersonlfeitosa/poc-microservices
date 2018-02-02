package com.andersonlfeitosa.openshift;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixService {

  @Autowired
  private RestTemplate restTemplate;
  
  @Autowired
  @Lazy
  private EurekaClient discoveryClient;

  @Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@HystrixCommand(fallbackMethod = "reliable")
	public String readingList(){
		return this.restTemplate.getForObject(URI.create(serviceUrl() + "poc-ms1"), String.class);
	}

	public String reliable() {
		return "Reliable Hello World, this is a SpringBoot Microservice at OpenShift";
	}
	
	public String serviceUrl() {
	  InstanceInfo instance = discoveryClient.getNextServerFromEureka("poc-ms1", false);
	  return instance.getHomePageUrl();
	}
}