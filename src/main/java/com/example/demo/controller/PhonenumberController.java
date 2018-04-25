package com.example.demo.controller;

import com.example.demo.model.Phonenumber;
import com.example.demo.service.phonenumber.IPhonenumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phonenumbers")
public class PhonenumberController {
    @Autowired
    IPhonenumberService service;

    @RequestMapping("/get")
    public List<Phonenumber> getPhonenumbers(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Phonenumber insertPhonenumber(@RequestBody Phonenumber phonenumber) {
        return service.save(phonenumber);
    }

    @RequestMapping("/update")
    public Phonenumber updatePhonenumber(@RequestBody Phonenumber phonenumber,@RequestParam("id") long id) {
        phonenumber.setId(id);
        return service.update(phonenumber);
    }

    @RequestMapping("/del")
    public void delPhonenumber(@RequestParam("id") int id){
        service.deleteById(id);
    }
}
