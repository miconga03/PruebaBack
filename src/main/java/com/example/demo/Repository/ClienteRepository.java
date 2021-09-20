package com.example.demo.Repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    //Convecnion sobre configuracion, busca desde el nombre de usuario
    //public Set<Cliente> findByAll(String username);

    //Para buscar usuarios existentes
    public Optional<Cliente> findAllByUsername(String username);

}
