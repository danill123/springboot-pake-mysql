package com.spring.dude.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private String name;
    private String info;

    public Rooms() {

    }

    public Rooms(Integer id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
