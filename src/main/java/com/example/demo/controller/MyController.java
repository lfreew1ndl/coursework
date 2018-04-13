package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Number;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class MyController {
    @Autowired
    RegionRepository regionRepository;

    @Autowired
    StreetRepository streetRepository;

    @Autowired
    CallsRepository callsRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    ConsumerRepository consumerRepository;

    @Autowired
    MTCRepository mtcRepository;

    @Autowired
    NumberRepository numberRepository;

    @Autowired
    PayphonesRepository payphonesRepository;

    @Autowired
    PhonenumberRepository phonenumberRepository;

    @Autowired
    QueueRepository queueRepository;

    @RequestMapping("/streets")
    public List<Street> getStreets(){
        return streetRepository.findAll();
    }

    @RequestMapping("/regions")
    public List<Region> getRegions(){
        return regionRepository.findAll();
    }

    @RequestMapping("/calls")
    public List<Calls> getCalls(){
        return callsRepository.findAll();
    }

    @RequestMapping("/cities")
    public List<City> getCities(){
        return cityRepository.findAll();
    }

    @RequestMapping("/consumers")
    public List<Consumer> getConsumers(){
        return consumerRepository.findAll();
    }

    @RequestMapping("/mtces")
    public List<Mtc> getMTCes(){
        return mtcRepository.findAll();
    }

    @RequestMapping("/numbers")
    public List<Number> getNumbers(){
        return numberRepository.findAll();
    }

    @RequestMapping("/payphones")
    public List<Payphones> getPayphones(){
        return payphonesRepository.findAll();
    }

    @RequestMapping("/phonenumbers")
    public List<Phonenumber> getPhonenumbers(){
        return phonenumberRepository.findAll();
    }

    @RequestMapping("/queues")
    public List<Queue> getQueues(){
        return queueRepository.findAll();
    }


}
