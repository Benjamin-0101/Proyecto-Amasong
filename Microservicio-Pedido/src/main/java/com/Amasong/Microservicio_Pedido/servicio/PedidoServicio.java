package com.Amasong.Microservicio_Pedido.servicio;

import com.Amasong.Microservicio_Pedido.modelo.Pedido;
import com.Amasong.Microservicio_Pedido.repositorio.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicio {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    // Lista todos los pedidos registrados
    public List<Pedido> listarPedidos() {
        return pedidoRepositorio.findAll();
    }

    // Busca un pedido por su ID
    public Optional<Pedido> obtenerPedidoPorId(Long id) {
        return pedidoRepositorio.findById(id);
    }

    // Guarda un nuevo pedido o actualiza uno existente
    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    // Elimina un pedido por su ID
    public void eliminarPedido(Long id) {
        pedidoRepositorio.deleteById(id);
    }
}
