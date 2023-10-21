package com.bookmarksync.bookmarksync.entitites;


import com.bookmarksync.bookmarksync.exception.BookmarkSyncException;
import org.apache.logging.log4j.util.Strings;

public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String tokenHash;

    // Retrieve existing user
    public User(String username, String password)  {
        // TODO: Get properties from DB & populate variables
        this.username = username;
        this.passwordHash = password;
    }

    // Create new user
    public User(String username, String firstName, String lastName, String password) throws BookmarkSyncException{
        if (Strings.isBlank(username) ||
                Strings.isBlank(firstName) ||
                Strings.isBlank(lastName) ||
                Strings.isBlank(password))    {
            throw new BookmarkSyncException(BookmarkSyncException.Message.EMPTY_INPUT);
        }
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = password; // TODO: Hash password
        this.tokenHash = "123"; // TODO: Generate Token
    }

    // Persist User
    public void persistUser() {

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
}