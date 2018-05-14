package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.region.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {
    @Autowired
    IRegionService regionService;

    @RequestMapping("/get")
    public List<Region> getRegions(){
        return regionService.getAll();
    }

    @PostMapping("/insert")
    public Region insertRegion(@RequestBody Region region) {
        return regionService.save(region);
    }

    @RequestMapping("/update")
    public Region updateRegion(@RequestBody Region region,@RequestParam("id") long id) {
        region.setId(id);
        return regionService.update(region);
    }

    @RequestMapping("/del")
    public void delRegion(@RequestParam("id") int id){
        regionService.deleteById((long)id);
    }
}
