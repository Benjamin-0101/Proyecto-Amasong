package com.Amasong.Microservicio_Bodega.controlador;

import com.Amasong.Microservicio_Bodega.modelo.Bodega;
import com.Amasong.Microservicio_Bodega.servicio.BodegaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodegas")
@CrossOrigin("*")
public class BodegaControlador {

    private final BodegaServicio bodegaServicio;

    public BodegaControlador(BodegaServicio bodegaServicio) {
        this.bodegaServicio = bodegaServicio;
    }

    @GetMapping("/test")
    public String test() {
        return "API Bodega funcionando";
    }

    @PostMapping
    public Bodega agregarBodega(@RequestBody Bodega bodega) {
        return bodegaServicio.guardarBodega(bodega);
    }

    @GetMapping
    public List<Bodega> listarBodegas() {
        return bodegaServicio.obtenerBodegas();
    }

    @GetMapping("/{id}")
    public Bodega obtenerBodega(@PathVariable Long id) {
        return bodegaServicio.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarBodega(@PathVariable Long id) {
        bodegaServicio.eliminarBodega(id);
    }
}
