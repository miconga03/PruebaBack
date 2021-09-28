package com.example.demo.Controller;

import com.example.demo.Service.ProductoService;
import com.example.demo.model.Cliente;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto producto) throws Exception {
        return new ResponseEntity<>(productoService.create(producto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Producto> update(@RequestBody Producto producto){
        productoService.update(producto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable("id") Integer idProducto) throws Exception{
        Producto producto = productoService.findById(idProducto);
        if( producto == null){
            throw new Exception("El cliente no existe");
        }
        return new ResponseEntity<>(productoService.findById(idProducto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer idProducto) throws Exception {
        Producto producto = productoService.findById(idProducto);
        if(producto == null){
            throw new Exception("El cliente que desea eliminar no existe");
        }
        productoService.delete(idProducto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
