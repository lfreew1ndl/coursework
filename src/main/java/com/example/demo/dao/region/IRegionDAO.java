package com.example.demo.dao.region;

import com.example.demo.model.Region;

import java.util.List;

public interface IRegionDAO {
    Region save(Region region);

    Region update(Region region);

    void deleteById(int id);

    List<Region> getAll();
}
