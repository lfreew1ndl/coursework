package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {
    @Autowired
    RegionRepository regionRepository;

    @RequestMapping("/get")
    public List<Region> getRegions(){
        return regionRepository.findAll();
    }

    @PostMapping("/insert")
    public Region insertRegion(@RequestBody Region region) {
        return regionRepository.save(region);
    }

    @RequestMapping("/update")
    public Region updateRegion(@RequestBody Region region,@RequestParam("id") long id) {
        region.setId(id);
        return regionRepository.save(region);
    }

    @RequestMapping("/del")
    public void delRegion(@RequestParam("id") int id){
        regionRepository.deleteById((long)id);
    }
}
