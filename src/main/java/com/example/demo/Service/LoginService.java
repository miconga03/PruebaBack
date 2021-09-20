package com.example.demo.Service;

import com.example.demo.model.Login;

import java.util.List;

public interface LoginService {
    Login create(Login login);

    Login update(Login login);

    Login findById(Integer id);

    List<Login> findAll();

    void delete(Integer id);
}
