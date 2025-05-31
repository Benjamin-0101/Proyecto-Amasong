package com.Amasong.Microservicio_Inventario.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoProducto;
    private String ubicacion;
    private int cantidadDisponible;
    private String tipoAlmacenamiento;
    private LocalDate fechaIngreso;
    private String estado;
    private String proveedor;
    private String categoria;
}
