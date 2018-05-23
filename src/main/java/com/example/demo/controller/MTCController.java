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
    IMtcService mtcService;

    @RequestMapping("/get")
    public List<Mtc> getMTCes(){
        return mtcService.getAll();
    }

    @PostMapping("/insert")
    public Mtc insertMTC(@RequestBody Mtc mtc) {
        System.out.println(mtc.getId());
        return mtcService.save(mtc);
    }

    @RequestMapping("/update")
    public Mtc updateMTC(@RequestBody Mtc mtc,@RequestParam("id") long id) {
        mtc.setId(id);
        return mtcService.update(mtc);
    }

    @RequestMapping("/del")
    public void delMTC(@RequestParam("id") int id){
        mtcService.deleteById((long)id);
    }

    @RequestMapping("/getMtcsByAtcType")
    List<Mtc> getMtcsByAtcType(@RequestParam("atcType") ATCType atcType){
        return mtcService.getMtcsByAtcType(atcType);
    };

}
