package com.Amasong.Microservicio_Bodega.servicio;

import com.Amasong.Microservicio_Bodega.modelo.Bodega;
import com.Amasong.Microservicio_Bodega.repositorio.BodegaRepositorio;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaServicio {

    private final BodegaRepositorio bodegaRepositorio;

    public BodegaServicio(BodegaRepositorio bodegaRepositorio) {
        this.bodegaRepositorio = bodegaRepositorio;
    }

    public Bodega guardarBodega(Bodega bodega) {
        return bodegaRepositorio.save(bodega);
    }

    public List<Bodega> obtenerBodegas() {
        return bodegaRepositorio.findAll();
    }

    public Bodega obtenerPorId(Long id) {
        return bodegaRepositorio.findById(id).orElse(null);
    }

    public void eliminarBodega(Long id) {
        bodegaRepositorio.deleteById(id);
    }
}
