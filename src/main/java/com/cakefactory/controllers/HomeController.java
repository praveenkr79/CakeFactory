package com.cakefactory.controllers;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Data
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public  String Index()
    {
        return "home";
    }
}
