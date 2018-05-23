package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.consumer.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    IConsumerService repository;

    @RequestMapping("/get")
    public List<Consumer> getConsumers(){
        return repository.getAll();
    }

    @PostMapping("/insert")
    public Consumer insertConsumer(@RequestBody Consumer consumer) {
        return repository.save(consumer);
    }

    @RequestMapping("/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer,@RequestParam("id") long id) {
        consumer.setId(id);
        return repository.update(consumer);
    }

    @RequestMapping("/del")
    public void delConsumer(@RequestParam("id") int id){
        repository.deleteById((long)id);
    }

    @RequestMapping("/getConsumersByPhonenumberStreetMtc_Id")
    public List<Consumer> getConsumersByPhonenumberStreetMtc_Id(@RequestParam("id") long id){
        return repository.getConsumersByPhonenumberStreetMtc_Id(id);
    }

    @RequestMapping("/countConsumersByPhonenumberStreetMtc_Id")
    public int countConsumersByPhonenumberStreetMtc_Id(@RequestParam("id")long id) {
        return repository.countConsumersByPhonenumberStreetMtc_Id(id);
    }

    @RequestMapping("/countConsumersByBeneficiaryIsTrue")
    public int countConsumersByBeneficiaryIsTrue() {
        return repository.countConsumersByBeneficiaryIsTrue();
    }

    @RequestMapping("/countConsumersByAgeIsBetween")
    public int countConsumersByAgeIsBetween(@RequestParam("firstAge")long firstAge,@RequestParam("lastAge") long lastAge) {
        return repository.countConsumersByAgeIsBetween(firstAge,lastAge);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0")
    public List<Consumer> getConsumersByBalanceLessThan0() {
        return repository.getConsumersByBalanceLessThan0();
    }

    @RequestMapping("/countConsumersByBalanceLessThan0")
    public int countConsumersByBalanceLessThan0() {
        return repository.countConsumersByBalanceLessThan0();
    }

    @RequestMapping("/getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id")
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@RequestParam("id")long id) {
        return repository.getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @RequestMapping("/countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id")
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@RequestParam("id")long id) {
        return repository.countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id")
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@RequestParam("id")long id) {
        return repository.getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @RequestMapping("/countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id")
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@RequestParam("id")long id) {
        return repository.countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0OrderByBalance")
    public List<Consumer> getConsumersByBalanceLessThan0OrderByBalance() {
        return repository.getConsumersByBalanceLessThan0OrderByBalance();
    }
    @RequestMapping("/countConsumers")
    public int countConsumers() {
        return repository.countConsumers();
    }

    @RequestMapping("/getConsumersByPhonenumberStreetMtcAtcType")
    public List<Consumer> getConsumersByPhonenumberStreetMtcAtcType(@RequestParam("atcType") ATCType atcType) {
        return repository.getConsumersByPhonenumberStreetMtcAtcType(atcType);
    }

    @RequestMapping("/getConsumersByPhonenumberPhoneType")
    public List<Consumer> getConsumersByPhonenumberPhoneType() {
        return repository.getConsumersByPhonenumberPhoneType();
    }

    @RequestMapping("/getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue")
    public List<Consumer> getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue() {
        return repository.getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue();
    }

    @RequestMapping("/getConsumerByPhonenumberNumber")
    public List<Consumer> getConsumerByPhonenumberNumber(@RequestParam("number") long number) {
        return repository.getConsumerByPhonenumberNumber(number);
    }

}
