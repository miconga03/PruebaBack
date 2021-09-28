package com.example.demo.Service.implement;


import com.example.demo.Repository.ProductoRepository;
import com.example.demo.Service.ProductoService;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto create(Producto producto){
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto){
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Integer id) {
        Optional<Producto> productoOptional = productoRepository.findById(id);
        return productoOptional.orElse( null);
    }

    @Override
    public Producto getClienteById(Integer id) throws Exception{
        return productoRepository.findById(id).orElseThrow(() -> new Exception("El usuario para editar no existe"));
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll(); //clienteRepo.findAllByStatus
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
