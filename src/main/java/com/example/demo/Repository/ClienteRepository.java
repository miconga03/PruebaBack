package com.example.demo.Repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    //Convecnion sobre configuracion, busca desde el nombre de usuario
    //public Set<Cliente> findByUsername(String username);

}
