package org.demo.sbh.service.impl;

import org.demo.sbh.entity.User;
import org.demo.sbh.persist.UserDao;
import org.demo.sbh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findByNickname(String nickname) {
        return userDao.findByNickname(nickname);
    }
}
