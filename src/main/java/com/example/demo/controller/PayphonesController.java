package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payphones")
public class PayphonesController {

    @Autowired
    PayphoneRepository payphoneRepository;

    @RequestMapping("/get")
    public List<Payphone> getPayphones(){
        return payphoneRepository.findAll();
    }

    @PostMapping("/insert")
    public Payphone insertPayphone(@RequestBody Payphone payphone) {
        return payphoneRepository.save(payphone);
    }

    @RequestMapping("/update")
    public Payphone updatePayphone(@RequestBody Payphone payphone, @RequestParam("id") long id) {
        payphone.setId(id);
        return payphoneRepository.save(payphone);
    }

    @RequestMapping("/del")
    public void delPayphone(@RequestParam("id") int id){
        payphoneRepository.deleteById((long)id);
    }
}
