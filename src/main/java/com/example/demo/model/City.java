package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "city")
@EntityListeners(AuditingEntityListener.class)
public class City {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;


    @JsonIgnore
    @OneToMany(mappedBy = "cityWhoCall",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Calls> whoCallList;

    @JsonIgnore
    @OneToMany(mappedBy = "cityToWhomCall",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Calls> toWhomCallList;

    public City(String name, List<Calls> whoCallList, List<Calls> toWhomCallList) {
        this.name = name;
        this.whoCallList = whoCallList;
        this.toWhomCallList = toWhomCallList;
    }

    public City() {
    }

    public List<Calls> getWhoCallList() {
        return whoCallList;
    }

    public void setWhoCallList(List<Calls> whoCallList) {
        this.whoCallList = whoCallList;
    }

    public List<Calls> getToWhomCallList() {
        return toWhomCallList;
    }

    public void setToWhomCallList(List<Calls> toWhomCallList) {
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
