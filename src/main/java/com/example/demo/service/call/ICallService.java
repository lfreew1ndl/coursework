package com.example.demo.service.call;

import com.example.demo.model.Call;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICallService {
    Call save(Call call);

    Call update(Call call);

    void deleteById(long id);

    List<Call> getAll();
}
