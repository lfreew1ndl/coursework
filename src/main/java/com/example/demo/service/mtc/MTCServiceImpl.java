package com.example.demo.service.mtc;

import com.example.demo.dao.mtc.IMtcDAO;
import com.example.demo.dao.region.IRegionDAO;
import com.example.demo.model.Mtc;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MTCServiceImpl implements IMtcService {

    @Autowired
    IMtcDAO dao;

    @Override
    public Mtc save(Mtc mtc) {
        return dao.save(mtc);
    }

    @Override
    public Mtc update(Mtc mtc) {
        return dao.update(mtc);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Mtc> getAll() {
        return dao.getAll();
    }
}
