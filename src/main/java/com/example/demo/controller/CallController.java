package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.call.ICallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calls")
public class CallController {
    @Autowired
    ICallService callService;

    @RequestMapping("/get")
    public List<Call> getCalls(){
        return callService.getAll();
    }

    @PostMapping("/insert")
    public Call insertCall(@RequestBody Call call) {
        return callService.save(call);
    }

    @RequestMapping("/update")
    public Call updateCall(@RequestBody Call call,@RequestParam("id") long id) {
        call.setId(id);
        return callService.update(call);
    }

    @RequestMapping("/del")
    public void delCall(@RequestParam("id") int id){
        callService.deleteById((long)id);
    }

}
