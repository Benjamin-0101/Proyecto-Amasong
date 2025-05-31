package com.Amasong.Microservicio_Sesion.repositorio;

import com.Amasong.Microservicio_Sesion.modelo.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepositorio extends JpaRepository<Sesion, Long> {
}
