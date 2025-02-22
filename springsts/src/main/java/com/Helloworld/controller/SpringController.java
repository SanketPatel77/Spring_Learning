package com.Helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// controller
@Controller
public class SpringController {
    // show hello message after load the webpage
    @GetMapping()
    public String hello(){
        return "index"; // load index.html file
    }

    // this api call the web.html page
    @GetMapping("/web")
    public String web(){
        return "web"; // load web.html
    }
}
