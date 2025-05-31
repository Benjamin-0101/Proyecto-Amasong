package com.Amasong.Microservicio_Sesion.servicio;

import com.Amasong.Microservicio_Sesion.modelo.Sesion;
import com.Amasong.Microservicio_Sesion.repositorio.SesionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SesionServicio {

    @Autowired
    private SesionRepositorio sesionRepositorio;

    public List<Sesion> listarSesiones() {
        return sesionRepositorio.findAll();
    }

    public Optional<Sesion> obtenerSesionPorId(Long id) {
        return sesionRepositorio.findById(id);
    }

    public Sesion guardarSesion(Sesion sesion) {
        return sesionRepositorio.save(sesion);
    }

    public void eliminarSesion(Long id) {
        sesionRepositorio.deleteById(id);
    }
}
