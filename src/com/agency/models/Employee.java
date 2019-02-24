package com.agency.models;

import java.util.List;

public class Employee {
    //Give employee a unique id
    private Integer id;
    // Employee has a particular name
    private String employeeName;
    //A single employee can work on many contracts - so Employee has one-to-many relationship with Contract
    private List<Contract> contracts;

    public Employee(){};

    public Employee(Integer id , String name , List<Contract> contracts){
        this.id = id ;
        this.employeeName = name;
        this.contracts = contracts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
