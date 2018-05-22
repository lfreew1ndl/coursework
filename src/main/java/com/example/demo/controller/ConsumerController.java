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
    IConsumerService consumerService;

    @RequestMapping("/get")
    public List<Consumer> getConsumers(){
        return consumerService.getAll();
    }

    @PostMapping("/insert")
    public Consumer insertConsumer(@RequestBody Consumer consumer) {
        return consumerService.save(consumer);
    }

    @RequestMapping("/update")
    public Consumer updateConsumer(@RequestBody Consumer consumer,@RequestParam("id") long id) {
        consumer.setId(id);
        return consumerService.update(consumer);
    }

    @RequestMapping("/del")
    public void delConsumer(@RequestParam("id") int id){
        consumerService.deleteById((long)id);
    }

    @RequestMapping("/getConsumersByPhonenumberStreetMtc_Id")
    public List<Consumer> getConsumersByPhonenumberStreetMtc_Id(@RequestParam("id") long id){
        return consumerService.getConsumersByPhonenumberStreetMtc_Id(id);
    }

    @RequestMapping("/countConsumersByPhonenumberStreetMtc_Id")
    public int countConsumersByPhonenumberStreetMtc_Id(@RequestParam("id")long id) {
        return consumerService.countConsumersByPhonenumberStreetMtc_Id(id);
    }

    @RequestMapping("/countConsumersByBeneficiaryIsTrue")
    public int countConsumersByBeneficiaryIsTrue() {
        return consumerService.countConsumersByBeneficiaryIsTrue();
    }

    @RequestMapping("/countConsumersByAgeIsBetween")
    public int countConsumersByAgeIsBetween(@RequestParam("firstAge")long firstAge,@RequestParam("lastAge") long lastAge) {
        return consumerService.countConsumersByAgeIsBetween(firstAge,lastAge);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0")
    public List<Consumer> getConsumersByBalanceLessThan0() {
        return consumerService.getConsumersByBalanceLessThan0();
    }

    @RequestMapping("/countConsumersByBalanceLessThan0")
    public int countConsumersByBalanceLessThan0() {
        return consumerService.countConsumersByBalanceLessThan0();
    }

    @RequestMapping("/getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id")
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@RequestParam("id")long id) {
        return consumerService.getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @RequestMapping("/countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id")
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@RequestParam("id")long id) {
        return consumerService.countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id")
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@RequestParam("id")long id) {
        return consumerService.getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @RequestMapping("/countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id")
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@RequestParam("id")long id) {
        return consumerService.countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @RequestMapping("/getConsumersByBalanceLessThan0OrderByBalance")
    public List<Consumer> getConsumersByBalanceLessThan0OrderByBalance() {
        return consumerService.getConsumersByBalanceLessThan0OrderByBalance();
    }
    @RequestMapping("/countConsumers")
    public int countConsumers() {
        return consumerService.countConsumers();
    }

}
