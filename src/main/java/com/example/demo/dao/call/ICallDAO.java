package com.example.demo.dao.call;

import com.example.demo.model.Call;

import java.util.List;

public interface ICallDAO {
    Call save(Call call);

    Call update(Call call);

    void deleteById(int id);

    List<Call> getAll();
}
