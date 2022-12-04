package com.example.RestfulCRUD.model;

public class Model {

    private long id;
    private String name;
    private String surname;
    private long telNo;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getTelNo() {
        return telNo;
    }

    public void setTelNo(long telNo) {
        this.telNo = telNo;
    }

    public Model(){

    }
    public Model(long id, String name, String surname, long telNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telNo = telNo;
    }
}
