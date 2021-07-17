package com.springboot.fundamentals.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/ceva")
    String printSmth() {
        return "Wtf is this";
    }
    @RequestMapping("/")
    String smthPrint() {
        return "First page mapped";
    }
}
