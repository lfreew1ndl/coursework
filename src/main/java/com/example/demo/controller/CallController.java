package com.example.demo.controller;

import com.example.demo.model.Call;
import com.example.demo.service.call.ICallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calls")
public class CallController {

    @Autowired
    ICallService service;

    @RequestMapping("/get")
    public List<Call> getCalls(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Call insertCall(@RequestBody Call call) {
        return service.save(call);
    }

    @RequestMapping("/update")
    public Call updateCall(@RequestBody Call call,@RequestParam("id") long id) {
        call.setId(id);
        return service.update(call);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
