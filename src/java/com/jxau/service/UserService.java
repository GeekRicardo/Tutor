package com.jxau.service;


import com.jxau.dao.UserDao;
import com.jxau.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUser();
}
