package co.com.phi.negocio.dominio;

import static co.com.phi.transversal.mensaje.codigomensaje.CodigosMensajes.ProductoMensajes.*;

import static co.com.phi.transversal.utilitario.validador.Validador.*;

import java.util.Date;

import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class Producto {
    private static final int MAX_LONGITUD_NOMBRE = 2;
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
        obligatorio(nombre, MEN_TEC_NOMBRE_OBLIGATORIO, MEN_USU_NOMBRE_OBLIGATORIO);
        longitud(nombre, MAX_LONGITUD_NOMBRE, MEN_TEC_NOMBRE_MAX_LONG, MEN_USU_NOMBRE_MAX_LONG);
        this.nombre = aplicarTrim(nombre);
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        obligatorio(precio, MEN_TEC_PRECIO_OBLIGATORIO, MEN_USU_PRECIO_OBLIGATORIO);
        positivo(precio, MEN_TEC_PRECIO_POSITIVO, MEN_USU_PRECIO_POSITIVO);
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        obligatorio(cantidad, MEN_TEC_CANTIDAD_OBLIGATORIA, MEN_USU_CANTIDAD_OBLIGATORIA);
        positivo(precio, MEN_TEC_CANTIDAD_POSITIVA, MEN_USU_CANTIDAD_POSITIVA);
        this.cantidad = cantidad;
    }

    public Date getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }
}
