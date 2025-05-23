package com.ankithm.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // When there is a request for a particular webpage like "/home", this method will be called.
    @RequestMapping("/home")
    public String displayHomePage() {
        return "home.html";
    }
}
