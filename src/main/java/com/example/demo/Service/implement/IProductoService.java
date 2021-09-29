package com.example.demo.Service.implement;

import com.example.demo.model.Cliente;
import com.example.demo.model.Login;
import com.example.demo.model.Producto;

import java.util.List;

public interface IProductoService {
    Producto create(Producto cliente);

    Producto update(Producto cliente);

    Producto findById(Integer id);

    public List<Producto> finAll() throws Exception;

    void delete(Integer id);
}
