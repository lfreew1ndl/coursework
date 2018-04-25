package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    ICityService service;

    @RequestMapping("/get")
    public List<City> getCitys(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public City insertCity(@RequestBody City city) {
        return service.save(city);
    }

    @RequestMapping("/update")
    public City updateCity(@RequestBody City city,@RequestParam("id") long id) {
        city.setId(id);
        return service.update(city);
    }

    @RequestMapping("/del")
    public void delCity(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
