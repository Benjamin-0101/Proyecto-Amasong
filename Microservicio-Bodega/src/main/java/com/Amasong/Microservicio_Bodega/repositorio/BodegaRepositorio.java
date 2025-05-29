package com.Amasong.Microservicio_Bodega.repositorio;

import com.Amasong.Microservicio_Bodega.modelo.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodegaRepositorio extends JpaRepository<Bodega, Long> {
    // Métodos personalizados si es que se requieren
}
