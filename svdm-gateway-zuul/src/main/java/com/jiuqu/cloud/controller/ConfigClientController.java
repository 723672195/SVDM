package com.jiuqu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${eureka.client.serviceUrl.defaultZone}")
  private String defaultZone;

  @GetMapping("/url")
  public String url() {
    return this.url;
  }

  @GetMapping("/username")
  public String username() {
    return this.username;
  }

  @GetMapping("/password")
  public String password() {
    return this.password;
  }

  @GetMapping("/eureka/defaultZone")
  public String defaultZone() {
    return this.defaultZone;
  }
}
