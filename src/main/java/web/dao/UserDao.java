package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUser();

    void addUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    User updateUser(User user);
}
