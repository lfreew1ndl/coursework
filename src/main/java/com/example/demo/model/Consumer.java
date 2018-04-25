package com.example.demo.model;

public class Consumer {

  private long id;
  private String firstName;
  private String lastName;
  private String sex;
  private long age;
  private long balance;
  private boolean beneficiary;
  private long phonenumber_id;
  private boolean connected;
  private Phonenumber phonenumber;

  public Consumer(long id, String firstName, String lastName, String sex, long age, long balance, boolean beneficiary, long phonenumber_id, boolean connected) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.sex = sex;
    this.age = age;
    this.balance = balance;
    this.beneficiary = beneficiary;
    this.phonenumber_id = phonenumber_id;
    this.connected = connected;
  }

  public Consumer() {
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

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public boolean getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(boolean beneficiary) {
    this.beneficiary = beneficiary;
  }

  public long getPhonenumber_id() {
    return phonenumber_id;
  }

  public void setPhonenumber_id(long phonenumber_id) {
    this.phonenumber_id = phonenumber_id;
  }

  public boolean getConnected() {
    return connected;
  }

  public void setConnected(boolean connected) {
    this.connected = connected;
  }

  public Phonenumber getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(Phonenumber phonenumber) {
    this.phonenumber = phonenumber;
  }
}
