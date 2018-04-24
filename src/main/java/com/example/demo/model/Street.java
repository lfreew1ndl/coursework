package com.example.demo.model;

public class Street {

  private long id;
  private String name;
  private long regionId;
  private long index;
  private long channels;
  private long mtcId;


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


  public long getRegionId() {
    return regionId;
  }

  public void setRegionId(long regionId) {
    this.regionId = regionId;
  }


  public long getIndex() {
    return index;
  }

  public void setIndex(long index) {
    this.index = index;
  }


  public long getChannels() {
    return channels;
  }

  public void setChannels(long channels) {
    this.channels = channels;
  }


  public long getMtcId() {
    return mtcId;
  }

  public void setMtcId(long mtcId) {
    this.mtcId = mtcId;
  }

}
