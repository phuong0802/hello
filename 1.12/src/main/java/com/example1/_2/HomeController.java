package com.example1._2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showCv() {
        return "index"; // Render ra file templates/index.html
    }
}
