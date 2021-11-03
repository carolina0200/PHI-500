package co.com.phi.negocio.dominio;

import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class DetalleProducto {
    private int detalleId;
    private String facturaId;
    private Producto producto;
    private int cantidad;
    private long precio;

    public DetalleProducto(int detalleId, String facturaId, Producto producto, int cantidad, long precio) {
        setDetalleId(detalleId);
        setFacturaId(facturaId);
        setProducto(producto);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public DetalleProducto() { }

    public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
    }

    public String getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(String facturaId) {
        this.facturaId = aplicarTrim(facturaId);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
}
