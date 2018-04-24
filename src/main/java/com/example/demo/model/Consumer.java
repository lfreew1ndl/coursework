package com.example.demo.model;

public class Consumer {

  private long id;
  private String firstName;
  private String lastName;
  private String sex;
  private long age;
  private long balance;
  private long beneficiary;
  private long phoneNumberId;
  private long connected;


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


  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


  public long getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(long beneficiary) {
    this.beneficiary = beneficiary;
  }


  public long getPhoneNumberId() {
    return phoneNumberId;
  }

  public void setPhoneNumberId(long phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public long getConnected() {
    return connected;
  }

  public void setConnected(long connected) {
    this.connected = connected;
  }

}
