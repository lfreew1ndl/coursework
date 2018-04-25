package com.example.demo.controller;

import com.example.demo.model.Number;
import com.example.demo.model.Street;
import com.example.demo.service.number.INumberService;
import com.example.demo.service.street.IStreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    INumberService service;

    @RequestMapping("/get")
    public List<Number> getNumbers(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Number insertNumber(@RequestBody Number number) {
        return service.save(number);
    }

    @RequestMapping("/update")
    public Number updateNumber(@RequestBody Number number, @RequestParam("id") long id) {
        number.setId(id);
        return service.update(number);
    }

    @RequestMapping("/del")
    public void delNumber(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
