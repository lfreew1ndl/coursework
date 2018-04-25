package com.example.demo.controller;

import com.example.demo.model.Mtc;
import com.example.demo.model.Street;
import com.example.demo.service.mtc.IMtcService;
import com.example.demo.service.street.IStreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {

    @Autowired
    IStreetService service;

    @RequestMapping("/get")
    public List<Street> getStreets(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Street insertStreet(@RequestBody Street street) {
        return service.save(street);
    }

    @RequestMapping("/update")
    public Street updateStreet(@RequestBody Street street,@RequestParam("id") long id) {
        street.setId(id);
        return service.update(street);
    }

    @RequestMapping("/del")
    public void delStreet(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
