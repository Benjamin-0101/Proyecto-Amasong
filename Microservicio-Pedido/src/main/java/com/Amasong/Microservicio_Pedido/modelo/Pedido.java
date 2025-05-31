package com.Amasong.Microservicio_Pedido.modelo;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idCliente;
    private Long idProducto;
    private int cantidad;
    private double precioTotal;
    private String estado; // Ej: Pendiente, Enviado, Cancelado
    private LocalDate fechaPedido;
}
