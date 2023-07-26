package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    void addUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    User updateUser(User user);
}
