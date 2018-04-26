package com.example.demo.service.mtc;

import com.example.demo.model.Mtc;
import com.example.demo.model.Region;

import java.util.List;


public interface IMtcService {
    Mtc save(Mtc mtc);

    Mtc update(Mtc mtc);

    void deleteById(int id);

    List<Mtc> getAll();
}