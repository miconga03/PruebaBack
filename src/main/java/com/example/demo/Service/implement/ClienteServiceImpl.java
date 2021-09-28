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
    public Cliente create(Cliente cliente) throws Exception {
        //condicionando la creacion del usuario por medio del password y el user
        /*if( checkUsuarioExistente(cliente) && checkPasswordMatch(cliente)){
            clienteRepo.save(cliente);
        }*/
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
    public Cliente getClienteById(Integer id) throws Exception{
        return clienteRepo.findById(id).orElseThrow(() -> new Exception("El usuario para editar no existe"));
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll(); //clienteRepo.findAllByStatus
    }

    //Buscar un usuario existente en el DataBase
    /*private boolean checkUsuarioExistente(Cliente cliente) throws Exception{
        Optional<Cliente> userFound = clienteRepo.findAllByUsername(cliente.getUsername());
        if(userFound.isPresent()){
            throw new Exception("Usuario no disponible");
        }
        return true;
    }*/

    //Comprobar que la clave y la confirmacion sean iguales
    /*private boolean checkPasswordMatch(Cliente cliente) throws Exception{
        if( !cliente.getPassword().equals(cliente.getConfirmPassword())){
            throw new Exception("Password y confirm Password no son iguales");
        }
        return true;
    }*/

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
