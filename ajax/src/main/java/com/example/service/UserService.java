package com.example.service;

import com.example.bean.User;

import java.util.List;

public interface UserService {
    /*
        模糊查询
     */
    public abstract List<User> selectLike(String username);
}
