package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

  @RequestMapping("/list")
  public void list(){
    log.info("todo list .... ");
  }

  @RequestMapping(value ="/register", method= RequestMethod.GET)
  public void register(){
    log.info("todo register .... ");
  }
}
