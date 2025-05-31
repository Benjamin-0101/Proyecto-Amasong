package com.Amasong.Microservicio_Sesion.controlador;

import com.Amasong.Microservicio_Sesion.modelo.Sesion;
import com.Amasong.Microservicio_Sesion.servicio.SesionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Sesion")
public class SesionControlador {

    @Autowired
    private SesionServicio sesionServicio;

    @GetMapping
    public List<Sesion> listarSesiones() {
        return sesionServicio.listarSesiones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sesion> obtenerSesionPorId(@PathVariable Long id) {
        return sesionServicio.obtenerSesionPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Sesion crearSesion(@RequestBody Sesion sesion) {
        return sesionServicio.guardarSesion(sesion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSesion(@PathVariable Long id) {
        if (sesionServicio.obtenerSesionPorId(id).isPresent()) {
            sesionServicio.eliminarSesion(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
