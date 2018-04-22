package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    ConsumerRepository consumerRepository;

    @RequestMapping("/get")
    public List<Consumer> getConsumers(){
        return consumerRepository.findAll();
    }

    @PostMapping("/insert")
    public Consumer insertConsumer(@RequestBody Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    @RequestMapping("/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer,@RequestParam("id") long id) {
        consumer.setId(id);
        return consumerRepository.save(consumer);
    }

    @RequestMapping("/del")
    public void delConsumer(@RequestParam("id") int id){
        consumerRepository.deleteById((long)id);
    }

}
