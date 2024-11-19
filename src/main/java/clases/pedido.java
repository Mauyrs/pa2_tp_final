
package clases;


public class Pedido {
    private String estado;
    // falta el hashmap 
    // entregaEstim tmb falta
    private int idPedido;
    private Pago pago;
    private double montoPedido;

    public Pedido() {
    }

    public Pedido(String estado, int idPedido, Pago pago, double montoPedido) {
        this.estado = estado;
        this.idPedido = idPedido;
        this.pago = pago;
        this.montoPedido = montoPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }
        
    
}
