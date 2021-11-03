package co.com.phi.dto;

import java.util.Date;
import java.util.List;

import static co.com.phi.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class FacturaDTO {
    private String facturaId;
    private PersonaDTO cliente;
    private List<DetalleProductoDTO> detalleProductos;
    private Date fecha;

    public FacturaDTO(String facturaId, PersonaDTO cliente, List<DetalleProductoDTO> detalleProductos, Date fecha) {
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

    public PersonaDTO getCliente() {
        return cliente;
    }

    public void setCliente(PersonaDTO cliente) {
        this.cliente = cliente;
    }

    public List<DetalleProductoDTO> getDetalleProductos() {
        return detalleProductos;
    }

    public void setDetalleProductos(List<DetalleProductoDTO> detalleProductos) {
        this.detalleProductos = detalleProductos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = obtenerFechaDefecto(fecha);
    }
}
