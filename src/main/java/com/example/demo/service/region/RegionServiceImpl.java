package com.example.demo.service.region;

import com.example.demo.repository.RegionRepository;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements IRegionService{

    @Autowired
    RegionRepository repository;

    @Override
    public Region save(Region region) {
        return repository.save(region);
    }

    @Override
    public Region update(Region region) {
        return repository.save(region);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Region> getAll() {
        return repository.findAll();
    }
}
