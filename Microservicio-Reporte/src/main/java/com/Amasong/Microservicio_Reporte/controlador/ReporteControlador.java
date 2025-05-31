package com.Amasong.Microservicio_Reporte.controlador;

import com.Amasong.Microservicio_Reporte.modelo.Reporte;
import com.Amasong.Microservicio_Reporte.servicio.ReporteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reporte")
public class ReporteControlador {

    @Autowired
    private ReporteServicio servicio;

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola desde ReporteControlador";
    }

    @GetMapping
    public List<Reporte> listarReportes() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/tipo/{tipo}")
    public List<Reporte> obtenerReportesPorTipo(@PathVariable String tipo) {
        return servicio.obtenerPorTipo(tipo);
    }

    @PostMapping
    public Reporte guardarReporte(@RequestBody Reporte reporte) {
        return servicio.guardar(reporte);
    }
}
