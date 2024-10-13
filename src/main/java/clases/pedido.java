
package clases;


public class pedido {
    private String estado;
    // falta el hashmap 
    // entregaEstim tmb falta
    private int idPedido;
    private pago pago;
    private double montoPedido;

    public pedido() {
    }

    public pedido(String estado, int idPedido, pago pago, double montoPedido) {
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

    public pago getPago() {
        return pago;
    }

    public void setPago(pago pago) {
        this.pago = pago;
    }

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }
        
    
}
