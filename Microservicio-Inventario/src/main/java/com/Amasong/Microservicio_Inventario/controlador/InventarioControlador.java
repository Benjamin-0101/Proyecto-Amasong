package com.Amasong.Microservicio_Inventario.controlador;

import com.Amasong.Microservicio_Inventario.modelo.Inventario;
import com.Amasong.Microservicio_Inventario.servicio.InventarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Inventario")
public class InventarioControlador {

    @Autowired
    private InventarioServicio servicio;

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola desde el microservicio de Inventario";
    }

    @GetMapping
    public List<Inventario> listarInventario() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Inventario> obtenerInventario(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Inventario guardarInventario(@RequestBody Inventario inventario) {
        return servicio.guardar(inventario);
    }

    @DeleteMapping("/{id}")
    public void eliminarInventario(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}
