package com.example.demo.controller;

import com.example.demo.model.Queue;
import com.example.demo.service.queue.IQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queues")
public class QueueController {
    @Autowired
    IQueueService service;

    @RequestMapping("/get")
    public List<Queue> getQueues(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Queue insertQueue(@RequestBody Queue queue) {
        return service.save(queue);
    }

    @RequestMapping("/update")
    public Queue updateQueue(@RequestBody Queue queue,@RequestParam("id") long id) {
        queue.setId(id);
        return service.update(queue);
    }

    @RequestMapping("/del")
    public void delQueue(@RequestParam("id") int id){
        service.deleteById(id);
    }
}
