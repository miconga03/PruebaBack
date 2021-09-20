package com.example.demo.Service.implement;

import com.example.demo.Repository.LoginRepository;
import com.example.demo.Service.LoginService;
import com.example.demo.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login create(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login update(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login findById(Integer id) {
        Optional<Login> loginOptional = loginRepository.findById(id);
        return loginOptional.orElse( null);
    }

    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        loginRepository.deleteById(id);
    }


}
