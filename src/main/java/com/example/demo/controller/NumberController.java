package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    NumberRepository numberRepository;


    @RequestMapping("/get")
    public List<Number> getNumbers(){
        return numberRepository.findAll();
    }

    @PostMapping("/insert")
    public Number insertNumber(@RequestBody Number number) {
        return numberRepository.save(number);
    }

    @RequestMapping("/update")
    public Number updateNumber(@RequestBody Number number,@RequestParam("id") long id) {
        number.setId(id);
        return numberRepository.save(number);
    }

    @RequestMapping("/del")
    public void delNumber(@RequestParam("id") int id){
        numberRepository.deleteById((long)id);
    }
}
