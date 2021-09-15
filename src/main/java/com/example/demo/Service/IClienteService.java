package com.example.demo.Service;


import ch.qos.logback.core.net.server.Client;
import com.example.demo.model.Cliente;

import java.util.List;


public interface IClienteService {

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    List<Cliente> findAll();

    void delete(Integer id);

}
