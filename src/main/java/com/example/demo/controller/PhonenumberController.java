package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.phonenumber.IPhonenumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phonenumbers")
public class PhonenumberController {

    @Autowired
    IPhonenumberService phonenumberService;

    @RequestMapping("/get")
    public List<Phonenumber> getPhonenumbers(){
        return phonenumberService.getAll();
    }

    @PostMapping("/insert")
    public Phonenumber insertPhonenumber(@RequestBody Phonenumber street) {
        System.out.println(street.getPhoneType());
        return phonenumberService.save(street);
    }

    @RequestMapping("/update")
    public Phonenumber updatePhonenumber(@RequestBody Phonenumber street,@RequestParam("id") long id) {
        street.setId(id);
        return phonenumberService.update(street);
    }

    @RequestMapping("/del")
    public void delPhonenumber(@RequestParam("id") int id){
        phonenumberService.deleteById((long)id);
    }

    @RequestMapping("/getByStreetId")
    public List<Phonenumber> getByStreetId(@RequestParam("id") long id){
        return phonenumberService.getPhonenumbersByStreet_id(id);
    }

    @RequestMapping("/countPhonenumbersByPhoneTypeIsPayPhone")
    public int countPhonenumbersByPhoneTypeIsPayPhone(){
        return phonenumberService.countPhonenumbersByPhoneTypeIsPayPhone();
    }

}
