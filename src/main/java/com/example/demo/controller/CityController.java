package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @RequestMapping("/get")
    public List<City> getCities(){
        return cityRepository.findAll();
    }
    @PostMapping("/insert")
    public City insertCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @RequestMapping("/update")
    public City updateCity(@RequestBody City city,@RequestParam("id") long id) {
        city.setId(id);
        return cityRepository.save(city);
    }

    @RequestMapping("/del")
    public void delCity(@RequestParam("id") int id){
        cityRepository.deleteById((long)id);
    }
}
