package com.Amasong.Microservicio_Pedido.controlador;

import com.Amasong.Microservicio_Pedido.modelo.Pedido;
import com.Amasong.Microservicio_Pedido.servicio.PedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Pedido")
public class PedidoControlador {

    @Autowired
    private PedidoServicio pedidoServicio;

    // Listar todos los pedidos
    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoServicio.listarPedidos();
    }

    // Obtener pedido por id
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> obtenerPedidoPorId(@PathVariable Long id) {
        Optional<Pedido> pedido = pedidoServicio.obtenerPedidoPorId(id);
        return pedido.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear un pedido nuevo
    @PostMapping
    public Pedido guardarPedido(@RequestBody Pedido pedido) {
        return pedidoServicio.guardarPedido(pedido);
    }
}
