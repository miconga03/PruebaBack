package com.example.demo.Controller;

import com.example.demo.Service.ClienteService;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) throws Exception {
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        clienteService.update(cliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente) throws Exception{
        Cliente cliente = clienteService.findById(idCliente);
        if( cliente == null){
            throw new Exception("El cliente no existe");
        }
        return new ResponseEntity<>(clienteService.findById(idCliente), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idCliente) throws Exception {
        Cliente cliente = clienteService.findById(idCliente);
        if(cliente == null){
            throw new Exception("El cliente que desea eliminar no existe");
        }
        clienteService.delete(idCliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
