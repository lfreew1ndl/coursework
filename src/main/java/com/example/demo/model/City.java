package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "city")
@EntityListeners(AuditingEntityListener.class)
public class City {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;


    @JsonIgnore
    @OneToMany(mappedBy = "cityWhoCall",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private List<Call> whoCallList;

    @JsonIgnore
    @OneToMany(mappedBy = "cityToWhomCall",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private List<Call> toWhomCallList;

    public City(long id, String name, List<Call> whoCallList, List<Call> toWhomCallList) {
        this.id = id;
        this.name = name;
        this.whoCallList = whoCallList;
        this.toWhomCallList = toWhomCallList;
    }

    public City() {
    }

    public List<Call> getWhoCallList() {
        return whoCallList;
    }

    public void setWhoCallList(List<Call> whoCallList) {
        this.whoCallList = whoCallList;
    }

    public List<Call> getToWhomCallList() {
        return toWhomCallList;
    }

    public void setToWhomCallList(List<Call> toWhomCallList) {
        this.toWhomCallList = toWhomCallList;
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
