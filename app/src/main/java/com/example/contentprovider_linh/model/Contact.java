package com.example.contentprovider_linh.model;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        phone = phone;
    }

    @Override
    public String toString() {
        return "Ten:"+name+"\nPhone:"+this.phone;
    }
}
