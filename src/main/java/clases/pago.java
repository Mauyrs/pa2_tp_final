
package clases;


public class Pago {
    private int idPago;
    private Usuario idUsuario;
    private double monto;
    private Pedido pedidoPago;

    public Pago() {
    }

    public Pago(int idPago, Usuario idUsuario, double monto, Pedido pedidoPago) {
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Pedido getPedidoPago() {
        return pedidoPago;
    }

    public void setPedidoPago(Pedido pedidoPago) {
        this.pedidoPago = pedidoPago;
    }
    
            
}
