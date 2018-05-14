package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    ICityService cityService;

    @RequestMapping("/get")
    public List<City> getCities(){
        return cityService.getAll();
    }
    @PostMapping("/insert")
    public City insertCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @RequestMapping("/update")
    public City updateCity(@RequestBody City city,@RequestParam("id") long id) {
        city.setId(id);
        return cityService.update(city);
    }

    @RequestMapping("/del")
    public void delCity(@RequestParam("id") int id){
        cityService.deleteById((long)id);
    }
}
