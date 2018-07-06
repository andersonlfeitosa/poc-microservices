package com.andersonlfeitosa.poc;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/api")
public class ApiController {

  private static final String VERSION = "2.0.0";

  @GetMapping("/api")
  @ApiOperation(value = "Authorize a transaction", notes = "Return an authorization", response = Authorization.class)
  @ApiResponses({ @ApiResponse(code = 200, message = "Success", response = Authorization.class),
      @ApiResponse(code = 500, message = "Error", response = Exception.class) })
  public Authorization sayHello() throws Exception {
    // return new Authorization(UUID.randomUUID().toString(),
    // InetAddress.getLocalHost().toString(), VERSION, new Date());
    return new Authorization(UUID.randomUUID().toString(), "oie", VERSION, new Date());
  }

}
