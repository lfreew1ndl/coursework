package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {

    @Autowired
    StreetRepository streetRepository;

    @RequestMapping("/get")
    public List<Street> getStreets(){
        return streetRepository.findAll();
    }
}
