package com.andrej.springbootjsp.web.controller;

import com.andrej.springbootjsp.web.constant.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("message", "Spring Boot application that uses JSP");
        return View.HOME.getPath();
    }

}
