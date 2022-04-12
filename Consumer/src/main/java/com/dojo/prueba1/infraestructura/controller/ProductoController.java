package com.dojo.prueba1.infraestructura.controller;

import com.dojo.prueba1.aplicacion.service.ServiceProducto;
import com.dojo.prueba1.dominio.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ServiceProducto serviceProducto;

    @GetMapping()
    public List<Producto> findPrductos(){
        return serviceProducto.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable("id") String id){
        return  serviceProducto.findById(id);
    }
}
