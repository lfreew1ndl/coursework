package com.example.demo.service.mtc;

import com.example.demo.model.ATCType;
import com.example.demo.model.Mtc;
import com.example.demo.model.Region;

import java.util.List;


public interface IMtcService {
    Mtc save(Mtc mtc);

    Mtc update(Mtc mtc);

    void deleteById(long id);

    List<Mtc> getAll();

    List<Mtc> getMtcsByAtcType(ATCType type);
}
