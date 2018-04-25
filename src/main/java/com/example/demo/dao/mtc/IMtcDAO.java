package com.example.demo.dao.mtc;

import com.example.demo.model.Mtc;

import java.util.List;

public interface IMtcDAO {
    Mtc save(Mtc mtc);

    Mtc update(Mtc mtc);

    void deleteById(int id);

    List<Mtc> getAll();
}
