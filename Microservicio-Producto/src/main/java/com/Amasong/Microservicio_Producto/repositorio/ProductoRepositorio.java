package com.Amasong.Microservicio_Producto.repositorio;

import com.Amasong.Microservicio_Producto.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}