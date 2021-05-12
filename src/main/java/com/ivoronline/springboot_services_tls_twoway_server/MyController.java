package com.ivoronline.springboot_services_tls_twoway_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Server";
  }

}
