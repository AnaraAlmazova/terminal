package com.company;

import company.Gender;
import dao.UserDao;
import model.User;
import service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {


//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1, "Bek", 29, Gender.MALE));
//        users.add(new User(2, "Suna", 25, Gender.FEMALE));
//        users.add(new User(3, "Jon", 34, Gender.MALE));

        UserDao userDao=new UserDao();
        UserServiceImpl userService = new UserServiceImpl(userDao);

        User user1 = new User(1, "Bek", 29, Gender.MALE);
        User user2 = new User(2, "Suna", 25, Gender.FEMALE);
        User user3 = new User(3, "jon", 34, Gender.MALE);

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);


        try {
            userService.deleteById(2);
            System.out.println(userService.findById(4));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(userService.findById(1));
        userService.getAllUsers();
        userService.deleteById(2);
        userService.getAllUsers();


    }







    }

    

