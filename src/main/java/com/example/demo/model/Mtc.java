package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mtc")
@EntityListeners(AuditingEntityListener.class)
public class Mtc {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "ATCType")
    private ATCType atcType;

    @JsonIgnore
    @OneToMany(mappedBy="mtc", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private List<Street> streets;

    public Mtc() {
    }

    public Mtc(String name, ATCType atcType, List<Street> streets) {
        this.name = name;
        this.atcType = atcType;
        this.streets = streets;
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

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
