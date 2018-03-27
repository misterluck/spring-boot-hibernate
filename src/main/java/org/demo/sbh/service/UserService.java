package org.demo.sbh.service;

import org.demo.sbh.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    List<User> findByNickname(String nickname);

}
