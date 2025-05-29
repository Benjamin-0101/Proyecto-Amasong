package com.Amasong.Microservicio_Producto.servicio;

import com.Amasong.Microservicio_Producto.modelo.Producto;
import com.Amasong.Microservicio_Producto.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio repositorio;

    public List<Producto> obtenerTodos() {
        return repositorio.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }

    public Producto guardar(Producto producto) {
        return repositorio.save(producto);
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}