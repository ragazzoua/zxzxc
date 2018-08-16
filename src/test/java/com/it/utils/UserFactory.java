package com.it.utils;

import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.it.utils.RandomUtils.getRandomString;

public class UserFactory {
    private static ResourceBundle bundle=ResourceBundle.getBundle("user");;


    static public User getValidUser() {
        return new User(bundle.getString("validLogin"),
                bundle.getString("validPassword"),
                bundle.getString("validEmail"));
    }
    static public User getInValidUser() {

        return new User(bundle.getString("inValidLogin"),
                bundle.getString("inValidPassword"),
                bundle.getString("inValidEmail"));
    }

    public static  List<User> getValidUsers(int count) {
        return Stream.generate(()-> new User(
                getRandomString(8),
                getRandomString(10),
                getRandomString(8)+"@i.ua"))
                .limit(count)
                .collect(Collectors.toList());

    }


}
