package co.com.phi.entidad;

import javax.persistence.*;

@Entity
@Table(name = "detalle_producto")
public class DetalleProductoEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_id")
    private int detalleId;

    @Column(name = "factura_id", insertable=false, updatable=false)
    private String facturaId;

    @Column(name = "producto_id")
    private long productoId;

    @ManyToOne
    @JoinColumn(name="producto_id", referencedColumnName="producto_id", insertable=false, updatable=false)
    private ProductoEntidad producto;

    private int cantidad;

    private long precio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "factura_id", nullable = false)
    private FacturaEntidad factura;

    public DetalleProductoEntidad() {
    }

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
        this.facturaId = facturaId;
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public ProductoEntidad getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntidad producto) {
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

    public FacturaEntidad getFactura() {
        return factura;
    }

    public void setFactura(FacturaEntidad factura) {
        this.factura = factura;
    }
}
