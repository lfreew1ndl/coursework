package com.example.demo.model;

public class City {

  private long id;
  private String name;


  public City(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public City() {
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

}
