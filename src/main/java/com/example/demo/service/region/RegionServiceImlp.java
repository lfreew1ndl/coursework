package com.example.demo.service.region;

import com.example.demo.dao.region.IRegionDAO;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImlp implements IRegionService{

    @Autowired
    IRegionDAO dao;

    @Override
    public Region save(Region region) {
        return dao.save(region);
    }

    @Override
    public Region update(Region region) {
        return dao.update(region);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Region> getAll() {
        return dao.getAll();
    }
}
