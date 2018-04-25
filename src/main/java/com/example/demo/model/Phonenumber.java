package com.example.demo.model;

public class Phonenumber {

  private long id;
  private long number_id;
  private String houseNumber;
  private Long apartment;
  private boolean interspace;
  private long street_id;
  private PhoneType phoneType;
  private Number number;
  private Street street;

  public Phonenumber() {
  }

  public Phonenumber(long id, long number_id, String houseNumber, Long apartment, boolean interspace, long street_id, PhoneType phoneType) {
    this.id = id;
    this.number_id = number_id;
    this.houseNumber = houseNumber;
    this.apartment = apartment;
    this.interspace = interspace;
    this.street_id = street_id;
    this.phoneType = phoneType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getNumber_id() {
    return number_id;
  }

  public void setNumber_id(long number_id) {
    this.number_id = number_id;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Long getApartment() {
    return apartment;
  }

  public void setApartment(Long apartment) {
    this.apartment = apartment;
  }

  public boolean getInterspace() {
    return interspace;
  }

  public void setInterspace(boolean interspace) {
    this.interspace = interspace;
  }

  public long getStreet_id() {
    return street_id;
  }

  public void setStreet_id(long street_id) {
    this.street_id = street_id;
  }

  public PhoneType getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneType phoneType) {
    this.phoneType = phoneType;
  }

  public Number getNumber() {
    return number;
  }

  public void setNumber(Number number) {
    this.number = number;
  }

  public Street getStreet() {
    return street;
  }

  public void setStreet(Street street) {
    this.street = street;
  }
}
