package com.example.demo.model;


public class PayPhone {

  private long id;
  private long phonenumber_id;
  private Phonenumber phonenumber;

  public PayPhone(long id, long phonenumber_id) {
    this.id = id;
    this.phonenumber_id = phonenumber_id;
  }

  public PayPhone() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPhonenumber_id() {
    return phonenumber_id;
  }

  public void setPhonenumber_id(long phonenumber_id) {
    this.phonenumber_id = phonenumber_id;
  }

  public Phonenumber getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(Phonenumber phonenumber) {
    this.phonenumber = phonenumber;
  }
}
