package com.example.demo.controller;

import com.example.demo.model.Number;
import com.example.demo.service.number.INumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    INumberService numberService;


    @RequestMapping("/get")
    public List<Number> getNumbers(){
        return numberService.getAll();
    }

    @PostMapping("/insert")
    public Number insertNumber(@RequestBody Number number) {
        return numberService.save(number);
    }

    @RequestMapping("/update")
    public Number updateNumber(@RequestBody Number number,@RequestParam("id") long id) {
        number.setId(id);
        return numberService.update(number);
    }

    @RequestMapping("/del")
    public void delNumber(@RequestParam("id") int id){
        numberService.deleteById((long)id);
    }

    @RequestMapping("/getNumbersByPhonenumberIsNull")
    public List<Number> getNumbersByPhonenumberIsNull(){
        return numberService.getNumbersByPhonenumberIsNull();
    }

    @RequestMapping("/countNumbersByPhonenumberIsNullAAnd")
    public int countNumbersByPhonenumberIsNullAAnd(){
        return numberService.countNumbersByPhonenumberIsNullAAnd();
    }
}
