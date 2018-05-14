package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.payphone.IPayphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payphones")
public class PayphonesController {

    @Autowired
    IPayphoneService payphoneService;

    @RequestMapping("/get")
    public List<Payphone> getPayphones(){
        return payphoneService.getAll();
    }

    @PostMapping("/insert")
    public Payphone insertPayphone(@RequestBody Payphone payphone) {
        return payphoneService.save(payphone);
    }

    @RequestMapping("/update")
    public Payphone updatePayphone(@RequestBody Payphone payphone, @RequestParam("id") long id) {
        payphone.setId(id);
        return payphoneService.update(payphone);
    }

    @RequestMapping("/del")
    public void delPayphone(@RequestParam("id") int id){
        payphoneService.deleteById((long)id);
    }
}
