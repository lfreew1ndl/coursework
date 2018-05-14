package com.example.demo.service.call;

import com.example.demo.repository.CallRepository;
import com.example.demo.model.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallServiceImpl implements ICallService {

    @Autowired
    CallRepository repository;

    @Override
    public Call save(Call call) {
        return repository.save(call);
    }

    @Override
    public Call update(Call call) {
        return repository.save(call);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Call> getAll() {
        return repository.findAll();
    }
}

