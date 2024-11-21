
package clases;

import java.time.LocalDate;


public class Pago {
    private Integer idPago;
    private Double monto;
    private LocalDate fechaPago;
    private Integer idPedido;

    public Pago(Integer idPago, Double monto, LocalDate fecha_pago, Integer idPedido) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fecha_pago;
        this.idPedido = idPedido;
    }

    public Pago(Double monto, LocalDate fecha_pago, Integer idPedido) {
        this.monto = monto;
        this.fechaPago = fecha_pago;
        this.idPedido = idPedido;
    }

    
    
    
    
    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fecha_pago) {
        this.fechaPago = fecha_pago;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    
    
    
    
}
