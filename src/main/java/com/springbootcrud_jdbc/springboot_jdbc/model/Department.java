package com.springbootcrud_jdbc.springboot_jdbc.model;

import org.springframework.context.annotation.Primary;

public class Department {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String d_id;
    private String d_name;
    private int years;
    private String position;

    public Department() {
    }

    public Department(int id,String d_id, String d_name, int years, String position) {
       this.id=id;

        this.d_id = d_id;
        this.d_name = d_name;
        this.years = years;
        this.position = position;
    }

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
