package com.Amasong.Microservicio_Pago.controlador;

import com.Amasong.Microservicio_Pago.modelo.Pago;
import com.Amasong.Microservicio_Pago.servicio.PagoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Pagos")
public class PagoControlador {

    @Autowired
    private PagoServicio servicio;

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola desde el controlador de pagos";
    }

    @GetMapping
    public List<Pago> listarPagos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Pago> obtenerPago(@PathVariable Long id) {
        return servicio.obtenerPorId(id);
    }

    @PostMapping
    public Pago guardarPago(@RequestBody Pago pago) {
        return servicio.guardar(pago);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}
