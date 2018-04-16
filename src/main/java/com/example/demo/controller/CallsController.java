package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calls")
public class CallsController {
    @Autowired
    CallsRepository callsRepository;

    @RequestMapping("/get")
    public List<Calls> getCalls(){
        return callsRepository.findAll();
    }

}
