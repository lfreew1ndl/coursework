package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String getIndex() {
        return "index.html";
    }
}
