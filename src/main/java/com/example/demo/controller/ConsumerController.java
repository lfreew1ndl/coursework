package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.consumer.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    IConsumerService consumerService;

    @RequestMapping("/get")
    public List<Consumer> getConsumers(){
        return consumerService.getAll();
    }

    @PostMapping("/insert")
    public Consumer insertConsumer(@RequestBody Consumer consumer) {
        return consumerService.save(consumer);
    }

    @RequestMapping("/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer,@RequestParam("id") long id) {
        consumer.setId(id);
        return consumerService.update(consumer);
    }

    @RequestMapping("/del")
    public void delConsumer(@RequestParam("id") int id){
        consumerService.deleteById((long)id);
    }

    @RequestMapping("/getConsumersByPhonenumberStreetMtc_Id")
    public List<Consumer> getConsumersByPhonenumberStreetMtc_Id(@RequestParam("id") long id){
        return consumerService.getConsumersByPhonenumberStreetMtc_Id(id);
    }

}
