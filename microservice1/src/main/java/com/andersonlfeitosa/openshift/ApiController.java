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

  // @RequestMapping("/{nome}")
  // public String sayHello(@PathVariable String nome) {
  // StringBuilder sb = new StringBuilder();
  // sb.append("Hello World!");
  // sb.append("</br>");
  // sb.append("SpringBoot Microservice at OpenShift");
  // sb.append("</br>");
  // sb.append("Welcome " + nome);
  // sb.append("</br>");
  // sb.append("</br>");
  // sb.append("IP: ");
  // try {
  // sb.append(InetAddress.getLocalHost());
  // } catch (UnknownHostException e) {
  // e.printStackTrace();
  // }
  //
  // return sb.toString();
  // }
  //
  // @RequestMapping("/")
  // public String sayHello() {
  // StringBuilder sb = new StringBuilder();
  // sb.append("Hello World!");
  // sb.append("</br>");
  // sb.append("SpringBoot Microservice at OpenShift");
  // sb.append("</br>");
  // sb.append("Welcome guest");
  // sb.append("</br>");
  // sb.append("</br>");
  // sb.append("IP: ");
  // try {
  // sb.append(InetAddress.getLocalHost());
  // } catch (UnknownHostException e) {
  // e.printStackTrace();
  // }
  //
  // return sb.toString();
  // }

}
