package com.example.demo.controller;

import com.example.demo.model.Consumer;
import com.example.demo.service.consumer.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    IConsumerService service;

    @RequestMapping("/get")
    public List<Consumer> getConsumers(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Consumer insertConsumer(@RequestBody Consumer consumer) {
        return service.save(consumer);
    }

    @RequestMapping("/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer,@RequestParam("id") long id) {
        consumer.setId(id);
        return service.update(consumer);
    }

    @RequestMapping("/del")
    public void delConsumer(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
