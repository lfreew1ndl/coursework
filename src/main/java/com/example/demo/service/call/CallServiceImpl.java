package com.example.demo.service.call;

import com.example.demo.dao.call.ICallDAO;
import com.example.demo.model.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallServiceImpl implements ICallService {
    @Autowired
    ICallDAO dao;

    @Override
    public Call save(Call call) {
        return dao.save(call);
    }

    @Override
    public Call update(Call call) {
        return dao.update(call);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Call> getAll() {
        return dao.getAll();
    }
}

