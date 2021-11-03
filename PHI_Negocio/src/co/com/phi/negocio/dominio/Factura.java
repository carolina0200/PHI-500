package co.com.phi.negocio.dominio;

import java.util.Date;
import java.util.List;

import static co.com.phi.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class Factura {
    private String facturaId;
    private Persona cliente;
    private List<DetalleProducto> detalleProductos;
    private Date fecha;

    public Factura(String facturaId, Persona cliente, List<DetalleProducto> detalleProductos, Date fecha) {
        setFacturaId(facturaId);
        setCliente(cliente);
        setDetalleProductos(detalleProductos);
        setFecha(fecha);
    }

    public String getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(String facturaId) {
        this.facturaId = aplicarTrim(facturaId);
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public List<DetalleProducto> getDetalleProductos() {
        return detalleProductos;
    }

    public void setDetalleProductos(List<DetalleProducto> detalleProductos) {
        this.detalleProductos = detalleProductos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = obtenerFechaDefecto(fecha);
    }
}
