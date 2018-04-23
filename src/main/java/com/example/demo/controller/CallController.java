package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calls")
public class CallController {
    @Autowired
    CallRepository callRepository;

    @RequestMapping("/get")
    public List<Call> getCalls(){
        return callRepository.findAll();
    }

    @PostMapping("/insert")
    public Call insertCall(@RequestBody Call call) {
        return callRepository.save(call);
    }

    @RequestMapping("/update")
    public Call updateCall(@RequestBody Call call,@RequestParam("id") long id) {
        call.setId(id);
        return callRepository.save(call);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        callRepository.deleteById((long)id);
    }

}
