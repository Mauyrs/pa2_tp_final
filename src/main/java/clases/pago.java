
package clases;


public class pago {
    private int idPago;
    private usuario idUsuario;
    private double monto;
    private pedido pedidoPago;

    public pago() {
    }

    public pago(int idPago, usuario idUsuario, double monto, pedido pedidoPago) {
        this.idPago = idPago;
        this.idUsuario = idUsuario;
        this.monto = monto;
        this.pedidoPago = pedidoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public pedido getPedidoPago() {
        return pedidoPago;
    }

    public void setPedidoPago(pedido pedidoPago) {
        this.pedidoPago = pedidoPago;
    }
    
            
}
