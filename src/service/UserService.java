package service;

import model.User;

public interface UserService  {

    void addUser(User user);

    User findById(int id);

    String deleteById(int id);

    void getAllUsers();


}
