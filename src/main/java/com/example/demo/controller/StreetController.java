package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {

    @Autowired
    StreetRepository streetRepository;

    @RequestMapping("/get")
    public List<Street> getStreets(){
        return streetRepository.findAll();
    }


    @PostMapping("/insert")
    public Street insertStreet(@RequestBody Street street) {
        return streetRepository.save(street);
    }

    @RequestMapping("/update")
    public Street updateStreet(@RequestBody Street street,@RequestParam("id") long id) {
        street.setId(id);
        return streetRepository.save(street);
    }

    @RequestMapping("/del")
    public void delStreet(@RequestParam("id") int id){
        streetRepository.deleteById((long)id);
    }
}
