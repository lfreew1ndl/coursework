package com.example.demo.model;

public class Phonenumber {

  private long id;
  private long number;
  private String houseNumber;
  private long apartment;
  private long interspace;
  private long streetId;
  private String phoneType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  public long getApartment() {
    return apartment;
  }

  public void setApartment(long apartment) {
    this.apartment = apartment;
  }


  public long getInterspace() {
    return interspace;
  }

  public void setInterspace(long interspace) {
    this.interspace = interspace;
  }


  public long getStreetId() {
    return streetId;
  }

  public void setStreetId(long streetId) {
    this.streetId = streetId;
  }


  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

}
