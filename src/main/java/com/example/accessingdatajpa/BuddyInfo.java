package com.example.accessingdatajpa;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class BuddyInfo {

    private String name;
    private String phoneNum;
    private long id;

    protected BuddyInfo() {
        name = "John Doe";
        phoneNum = "111111";
    }

    public BuddyInfo(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Buddy: id=%d, name ='%s', number='%s'",
                id, name, phoneNum
        );
    }

}
