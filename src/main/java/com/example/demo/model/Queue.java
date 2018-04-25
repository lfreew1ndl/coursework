package com.example.demo.model;

public class Queue {

  private long id;
  private String firstName;
  private String lastName;
  private String sex;
  private long age;
  private long street_id;
  private String houseNumber;
  private String apartment;
  private boolean beneficiary;
  private Street street;


  public Queue(long id, String firstName, String lastName, String sex, long age, long street_id, String houseNumber, String apartment, boolean beneficiary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.sex = sex;
    this.age = age;
    this.street_id = street_id;
    this.houseNumber = houseNumber;
    this.apartment = apartment;
    this.beneficiary = beneficiary;
  }

  public Queue() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

  public long getStreet_id() {
    return street_id;
  }

  public void setStreet_id(long street_id) {
    this.street_id = street_id;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public boolean getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(boolean beneficiary) {
    this.beneficiary = beneficiary;
  }

  public Street getStreet() {
    return street;
  }

  public void setStreet(Street street) {
    this.street = street;
  }
}
