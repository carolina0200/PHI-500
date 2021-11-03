package co.com.phi.negocio.dominio;

import java.util.Date;

import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class Producto {
    private long productoId;
    private String nombre;
    private long precio;
    private long cantidad;
    private Date actualizacion;

    public Producto() {
    }

    public Producto(long productoId, String nombre, long precio, long cantidad, Date actualizacion) {
        setProductoId(productoId);
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
        setActualizacion(actualizacion);
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = aplicarTrim(nombre);
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public Date getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }
}
