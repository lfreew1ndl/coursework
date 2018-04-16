package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/mtces")
public class MTCController {

    @Autowired
    MTCRepository mtcRepository;

    @RequestMapping("/get")
    public List<Mtc> getMTCes(){
        return mtcRepository.findAll();
    }

    @PostMapping("/insert")
    public Mtc insertOneChair(@RequestBody Mtc mtc) {
        return mtcRepository.save(mtc);
    }

    @RequestMapping("/del")
    public void delOneChair(@RequestParam("id") int id){
        mtcRepository.deleteById((long)id);
    }

}
