package com.Amasong.Microservicio_Pedido.repositorio;

import com.Amasong.Microservicio_Pedido.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
