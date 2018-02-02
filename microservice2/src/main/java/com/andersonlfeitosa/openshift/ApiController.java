package com.andersonlfeitosa.openshift;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

  @ResponseBody
  @RequestMapping(path = "/pow/{number}", method = RequestMethod.GET)
  public Double pow(@PathVariable Integer number) {
    return Math.pow(number.doubleValue(), 2);
  }

}
