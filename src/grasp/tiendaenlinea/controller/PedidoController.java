package grasp.tiendaenlinea.controller;

import org.grasp.tiendaenlinea.model.Cliente;
import org.grasp.tiendaenlinea.model.Pedido;
import org.grasp.tiendaenlinea.service.HistorialVentas;

public class PedidoController {

  private HistorialVentas historial;

  public PedidoController() {
    this.historial = new HistorialVentas();
  }

  public Pedido crearPedido(Cliente cliente) {
    return new Pedido(cliente);
  }

  public void procesarPedido(Pedido pedido) {
    pedido.mostrarPedido();
    historial.registrarVenta(pedido);
    System.out.println("Pedido procesado con éxito.\n");
  }

  public void mostrarHistorial() {
    historial.mostrarHistorial();
  }
}
