package co.com.phi.dto;

import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class DetalleProductoDTO {
    private int detalleId;
    private String facturaId;
    private ProductoDTO producto;
    private int cantidad;
    private long precio;

    public DetalleProductoDTO(int detalleId, String facturaId, ProductoDTO producto, int cantidad, long precio) {
        setDetalleId(detalleId);
        setFacturaId(facturaId);
        setProducto(producto);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public DetalleProductoDTO() { }

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

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
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
