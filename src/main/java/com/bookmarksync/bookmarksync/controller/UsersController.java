package com.bookmarksync.bookmarksync.controller;

import com.bookmarksync.bookmarksync.entitites.User;
import com.bookmarksync.bookmarksync.exception.BookmarkSyncException;
import com.bookmarksync.bookmarksync.requestbody.CreateUser;
import com.bookmarksync.bookmarksync.requestbody.LoginUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @PostMapping("/users")
    public String createUser(@RequestBody CreateUser requestBody) {
        try {
            User user = new User(requestBody.getUsername(), requestBody.getFirstName(), requestBody.getLastName(),
                    requestBody.getPassword());

            return "Creating new user " + user.getUsername();
        } catch (BookmarkSyncException e) {
            return e.getMessage();
        }
    }

    @PostMapping("/users/login")
    public String loginUser(@RequestBody LoginUser requestBody) {
        return "User" + requestBody.getUsername() + "logged in";
    }
}
