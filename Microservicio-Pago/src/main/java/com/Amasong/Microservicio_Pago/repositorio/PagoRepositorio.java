package com.Amasong.Microservicio_Pago.repositorio;

import com.Amasong.Microservicio_Pago.modelo.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepositorio extends JpaRepository<Pago, Long> {
}
