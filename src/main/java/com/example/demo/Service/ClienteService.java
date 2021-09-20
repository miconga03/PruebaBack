package com.example.demo.Service;

import com.example.demo.Repository.ClienteRepository;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Cliente create(Cliente cliente) throws Exception;

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    Cliente getClienteById(Integer id) throws Exception;

    List<Cliente> findAll();

    void delete(Integer id);
}
