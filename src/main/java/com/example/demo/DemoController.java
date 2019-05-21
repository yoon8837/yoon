package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class DemoController {

    @Controller
    public class HelloController {

        @RequestMapping("/")
        public String helloWorld(Model model) {
            System.out.println("실행은 된 것이여");
            model.addAttribute ("message", "Hello, World");
            return "Hello, World";
        }
    }
}
