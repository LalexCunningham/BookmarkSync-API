package com.bookmarksync.bookmarksync.requestbody;

public class CreateUser {
    private String username;
    private String firstName;
    private String lastName;
    private String password;


    public CreateUser(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
