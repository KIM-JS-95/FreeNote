package com.login.service;

import com.login.entity.Account;

public interface UserService {

    public Account getUserByEmail(String email) throws Exception;
    public Account getUserByUsername(String username) throws Exception;
    public Account setUser(Account user) throws Exception;
}
