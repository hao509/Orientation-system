package com.Digital_Orientation_System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("home")
    public  String index(){
        return "home";
    }
}
