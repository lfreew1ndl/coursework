package com.example.demo.controller;

import com.example.demo.model.PayPhone;
import com.example.demo.service.payPhone.IPayPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payphones")
public class PayPhoneController {
    @Autowired
    IPayPhoneService service;

    @RequestMapping("/get")
    public List<PayPhone> getPayPhones(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public PayPhone insertPayPhone(@RequestBody PayPhone payPhone) {
        return service.save(payPhone);
    }

    @RequestMapping("/update")
    public PayPhone updatePayPhone(@RequestBody PayPhone payPhone,@RequestParam("id") long id) {
        payPhone.setId(id);
        return service.update(payPhone);
    }

    @RequestMapping("/del")
    public void delPayPhone(@RequestParam("id") int id){
        service.deleteById(id);
    }
}
