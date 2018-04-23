package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insert")
    public Queue insertQueue(@RequestBody Queue queue) {
        return queueRepository.save(queue);
    }

    @RequestMapping("/update")
    public Queue updateQueue(@RequestBody Queue queue, @RequestParam("id") long id) {
        queue.setId(id);
        return queueRepository.save(queue);
    }

    @RequestMapping("/del")
    public void delQueue(@RequestParam("id") int id){
        queueRepository.deleteById((long)id);
    }


}
