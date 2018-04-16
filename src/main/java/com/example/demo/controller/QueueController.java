package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/queues")
public class QueueController {

    @Autowired
    QueueRepository queueRepository;

    @RequestMapping("/get")
    public List<Queue> getQueues(){
        return queueRepository.findAll();
    }


}
