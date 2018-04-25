package com.example.demo.controller;

import com.example.demo.model.*;

import com.example.demo.service.mtc.IMtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/mtces")
public class MTCController {

    @Autowired
    IMtcService service;

    @RequestMapping("/get")
    public List<Mtc> getMTCes(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public Mtc insertMTC(@RequestBody Mtc mtc) {
        return service.save(mtc);
    }

    @RequestMapping("/update")
    public Mtc updateMTC(@RequestBody Mtc mtc,@RequestParam("id") long id) {
        mtc.setId(id);
        return service.update(mtc);
    }

    @RequestMapping("/del")
    public void delMTC(@RequestParam("id") int id){
        service.deleteById(id);
    }

}
