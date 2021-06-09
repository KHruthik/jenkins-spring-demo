package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {

  @RequestMapping("/")
  public String helloWorld() {
    return "Hello World!";
  }

}