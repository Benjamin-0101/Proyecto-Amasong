package com.Amasong.Microservicio_Inventario.servicio;

import com.Amasong.Microservicio_Inventario.modelo.Inventario;
import com.Amasong.Microservicio_Inventario.repositorio.InventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioServicio {

    @Autowired
    private InventarioRepositorio repositorio;

    public List<Inventario> obtenerTodos() {
        return repositorio.findAll();
    }

    public Optional<Inventario> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }

    public Inventario guardar(Inventario inventario) {
        return repositorio.save(inventario);
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
