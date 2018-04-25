package com.example.demo.model;

public class Mtc {

  private long id = 0;
  private String name;
  private ATCType atcType;

  public Mtc(long id, String name, ATCType atcType) {
    this.id = id;
    this.name = name;
    this.atcType = atcType;
  }

  public Mtc() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ATCType getAtcType() {
    return atcType;
  }

  public void setAtcType(ATCType atcType) {
    this.atcType = atcType;
  }

}
