package com.example.demo.Controller;

import com.example.demo.Service.LoginService;
import com.example.demo.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public ResponseEntity<List<Login>> findAll(){
        return new ResponseEntity<>(loginService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Login> create(@RequestBody Login login){
        return new ResponseEntity<>(loginService.create(login), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Login> update(@RequestBody Login login){
        loginService.update(login);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Login> findById(@PathVariable("id") Integer idLogin) throws Exception{
        Login login = loginService.findById(idLogin);
        if( login == null){
            throw new Exception("El login no existe");
        }
        return new ResponseEntity<>(loginService.findById(idLogin), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idLogin) throws Exception {
        Login login = loginService.findById(idLogin);
        if(login == null){
            throw new Exception("El login que desea eliminar no existe");
        }
        loginService.delete(idLogin);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
