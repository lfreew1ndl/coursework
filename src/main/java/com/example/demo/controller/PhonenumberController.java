package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phonenumbers")
public class PhonenumberController {

    @Autowired
    PhonenumberRepository phonenumberRepository;

    @RequestMapping("/get")
    public List<Phonenumber> getPhonenumbers(){
        return phonenumberRepository.findAll();
    }

    @PostMapping("/insert")
    public Phonenumber insertPhonenumber(@RequestBody Phonenumber street) {
        return phonenumberRepository.save(street);
    }

    @RequestMapping("/update")
    public Phonenumber updatePhonenumber(@RequestBody Phonenumber street,@RequestParam("id") long id) {
        street.setId(id);
        return phonenumberRepository.save(street);
    }

    @RequestMapping("/del")
    public void delPhonenumber(@RequestParam("id") int id){
        phonenumberRepository.deleteById((long)id);
    }

}
