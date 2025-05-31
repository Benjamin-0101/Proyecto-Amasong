package com.Amasong.Microservicio_Inventario.repositorio;

import com.Amasong.Microservicio_Inventario.modelo.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepositorio extends JpaRepository<Inventario, Long> {
}
