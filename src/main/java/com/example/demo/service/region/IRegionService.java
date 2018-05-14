package com.example.demo.service.region;

import com.example.demo.model.Region;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IRegionService {
    Region save(Region region);

    Region update(Region region);

    void deleteById(long id);

    List<Region> getAll();
}
