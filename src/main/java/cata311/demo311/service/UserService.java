package cata311.demo311.service;


import cata311.demo311.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User showUser(Long id);

    void saveUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
