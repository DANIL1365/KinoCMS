package com.example.KinoCMS.service;

import com.example.KinoCMS.domain.User;

public interface UserService {

    boolean createUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    Long getCountUser();

    boolean activateUser(String code);
}
