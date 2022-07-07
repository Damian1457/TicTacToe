package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {

    private int userID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userID, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
