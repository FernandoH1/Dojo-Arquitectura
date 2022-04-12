package com.dojo.prueba1.aplicacion.service;

import com.dojo.prueba1.dominio.model.Producto;
import com.dojo.prueba1.dominio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProducto {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> findAll (){
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(String id){
        return productoRepository.findById(id);
    }

}

