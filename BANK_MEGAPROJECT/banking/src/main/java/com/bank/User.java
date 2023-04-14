package com.bank;

public class User {
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(Integer id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer id;
    public String firstName;
    public String lastName;
    public Integer account_id;
}
