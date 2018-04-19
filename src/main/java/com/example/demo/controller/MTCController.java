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
    public Mtc insertMTC(@RequestBody Mtc mtc) {
        System.out.println(mtc.getId());
        return mtcRepository.save(mtc);
    }

    @RequestMapping("/update")
    public Mtc updateMTC(@RequestBody Mtc mtc,@RequestParam("id") long id) {
        mtc.setId(id);
        return mtcRepository.save(mtc);
    }

    @RequestMapping("/del")
    public void delMTC(@RequestParam("id") int id){
        mtcRepository.deleteById((long)id);
    }

}
