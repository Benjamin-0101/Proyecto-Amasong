package com.Amasong.Microservicio_Pago.servicio;

import com.Amasong.Microservicio_Pago.modelo.Pago;
import com.Amasong.Microservicio_Pago.repositorio.PagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServicio {

    @Autowired
    private PagoRepositorio repositorio;

    public List<Pago> obtenerTodos() {
        return repositorio.findAll();
    }

    public Optional<Pago> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }

    public Pago guardar(Pago pago) {
        return repositorio.save(pago);
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
