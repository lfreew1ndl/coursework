package com.example.demo.model;

public class Queue {

  private long id;
  private String firstName;
  private String lastName;
  private String sex;
  private long age;
  private long streetId;
  private String houseNumber;
  private String apartment;
  private long beneficiary;


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


  public long getStreetId() {
    return streetId;
  }

  public void setStreetId(long streetId) {
    this.streetId = streetId;
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


  public long getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(long beneficiary) {
    this.beneficiary = beneficiary;
  }

}
