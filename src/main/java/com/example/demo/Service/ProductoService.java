package com.example.demo.Service;

import com.example.demo.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto create(Producto producto) throws Exception;

    Producto update(Producto producto);

    Producto findById(Integer id);

    Producto getClienteById(Integer id) throws Exception;

    List<Producto> findAll();

    void delete(Integer id);
}
