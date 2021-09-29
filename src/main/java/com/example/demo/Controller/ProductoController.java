package com.example.demo.Controller;

import com.example.demo.Service.ProductoService;
import com.example.demo.model.Login;
import com.example.demo.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    /*@GetMapping
    public ResponseEntity<List<Producto>> findAll() throws Exception {
        return new ResponseEntity<>(productoService.finAll(), HttpStatus.OK);
    }*/


    @GetMapping
    public ResponseEntity<List<Producto>> getAll() throws Exception {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.finAll());
    }
}
