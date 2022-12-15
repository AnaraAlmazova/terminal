package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {


    ArrayList<User>users=new ArrayList<>();

    public UserDao(){

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
