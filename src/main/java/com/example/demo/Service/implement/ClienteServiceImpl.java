package com.example.demo.Service.implement;

import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Service.ClienteService;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    //Para acceder a los datos
    @Autowired
    private ClienteRepository clienteRepo;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> clienteOptional = clienteRepo.findById(id);
        return clienteOptional.orElse( null);
    }

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
