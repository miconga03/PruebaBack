package com.example.demo.Service;

import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.ProductoRepository;
import com.example.demo.Service.implement.IClienteService;
import com.example.demo.Service.implement.IProductoService;
import com.example.demo.model.Cliente;
import com.example.demo.model.Login;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Service.implement.IClienteService;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    //Para acceder a los datos
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto create(Producto cliente) {
        return productoRepository.save(cliente);
    }

    @Override
    public Producto update(Producto cliente) {
        return productoRepository.save(cliente);
    }

    @Override
    public Producto findById(Integer id) {
        Optional<Producto> clienteOptional = productoRepository.findById(id);
        return clienteOptional.orElse( null);
    }

    @Override
    @Transactional
    public List<Producto> finAll() throws Exception {
        try {
            List<Producto> entities = productoRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
