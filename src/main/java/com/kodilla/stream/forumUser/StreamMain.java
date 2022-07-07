package com.kodilla.stream.forumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

    Forum forum = new Forum();

    Map<Integer, ForumUser> theNewList = forum.getForumUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> Period.between(s.getDateOfBirth(), LocalDate.now()).getYears() > 20)
                .filter(s -> s.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, s -> s));

                theNewList.entrySet().stream()
                        .map(entry -> entry.getKey() + " : " + entry.getValue())
                        .forEach(System.out::println);





    }

}
