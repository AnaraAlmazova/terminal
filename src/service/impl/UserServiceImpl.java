package service.impl;

import com.company.MyException;
import dao.UserDao;
import model.User;
import service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDao();

    public UserServiceImpl(UserDao userDao) {
    }

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);

    }

    @Override
    public User findById(int id) throws MyException {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                return userDao.getUsers().get(i);
            }


        }
                throw new MyException("User id: " + id + "  tabylgan jok");
            }


    @Override
    public String deleteById(int id) {
        ArrayList<User>deleteUser=userDao.getUsers();
        for (User userId : deleteUser) {
            if (userId.getId()==id){
                System.out.println(deleteUser.remove(userId));
            }

        }
        return "udaleno";
    }

    @Override
    public void getAllUsers() {
        ArrayList<User>users=userDao.getUsers();
        for (User user: users) {
            System.out.println(users);

        }



    }
}







