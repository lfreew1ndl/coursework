package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.street.IStreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {

    @Autowired
    IStreetService streetService;

    @RequestMapping("/get")
    public List<Street> getStreets(){
        return streetService.getAll();
    }


    @PostMapping("/insert")
    public Street insertStreet(@RequestBody Street street) {
        return streetService.save(street);
    }

    @RequestMapping("/update")
    public Street updateStreet(@RequestBody Street street,@RequestParam("id") long id) {
        street.setId(id);
        return streetService.update(street);
    }

    @RequestMapping("/del")
    public void delStreet(@RequestParam("id") int id){
        streetService.deleteById((long)id);
    }
}
