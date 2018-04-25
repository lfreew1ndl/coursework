package com.example.demo.model;

public class Number {

  private long id;
  private long number;

  public Number(long id, long number) {
    this.id = id;
    this.number = number;
  }

    public Number() {
    }

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

}
