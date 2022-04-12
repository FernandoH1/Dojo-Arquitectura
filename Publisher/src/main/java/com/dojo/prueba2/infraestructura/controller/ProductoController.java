package com.dojo.prueba2.infraestructura.controller;

import com.dojo.prueba2.dominio.model.Producto;
import com.dojo.prueba2.aplicacion.service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ServiceProducto serviceProducto;

    @PostMapping("/crear")
    public ResponseEntity<Producto> save(@RequestBody Producto producto){
        return new ResponseEntity<Producto>(serviceProducto.save(producto), HttpStatus.CREATED);
    }
}
