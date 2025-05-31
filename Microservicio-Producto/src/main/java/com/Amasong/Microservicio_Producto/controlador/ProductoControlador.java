package com.Amasong.Microservicio_Producto.controlador;

import com.Amasong.Microservicio_Producto.modelo.Producto;
import com.Amasong.Microservicio_Producto.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Producto")
public class ProductoControlador {

    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola desde el controlador";
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return servicio.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}