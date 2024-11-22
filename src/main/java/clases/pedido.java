
package clases;

import java.time.LocalDate;


public class Pedido {
    private int idPedido;
    private int idEstado;
    private LocalDate entregaEstimada;
    private int idUsuario;
    private LocalDate fechaPedido;

    public Pedido(int idPedido, int idEstado, LocalDate entregaEstimada, int idUsuario, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.idEstado = idEstado;
        this.entregaEstimada = entregaEstimada;
        this.idUsuario = idUsuario;
        this.fechaPedido = fechaPedido;
    }

    public Pedido(int idEstado, LocalDate entregaEstimada, int idUsuario, LocalDate fechaPedido) {
        this.idEstado = idEstado;
        this.entregaEstimada = entregaEstimada;
        this.idUsuario = idUsuario;
        this.fechaPedido = fechaPedido;
    }
    
    
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public LocalDate getEntregaEstimada() {
        return entregaEstimada;
    }

    public void setEntregaEstimada(LocalDate entregaEstimada) {
        this.entregaEstimada = entregaEstimada;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    

    
        
    
}
