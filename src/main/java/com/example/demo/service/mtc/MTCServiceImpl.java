package com.example.demo.service.mtc;

import com.example.demo.model.ATCType;
import com.example.demo.repository.MTCRepository;
import com.example.demo.model.Mtc;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MTCServiceImpl implements IMtcService {

    @Autowired
    MTCRepository repository;

    @Override
    public Mtc save(Mtc mtc) {
        return repository.save(mtc);
    }

    @Override
    public Mtc update(Mtc mtc) {
        return repository.save(mtc);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Mtc> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Mtc> getMtcsByAtcType(ATCType type) {
        return repository.getMtcsByAtcType(type);
    }
}
