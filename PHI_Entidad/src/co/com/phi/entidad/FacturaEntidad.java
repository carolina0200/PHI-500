package co.com.phi.entidad;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
public class FacturaEntidad {

    @Id
    @Column(name = "factura_id")
    private String facturaId;

    @Column(name = "cliente_id")
    private String clienteId;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="identificacion", insertable=false, updatable=false)
    private PersonaEntidad cliente;

    @OneToMany(mappedBy = "factura", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<DetalleProductoEntidad> detalleProductos;

    public String getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(String facturaId) {
        this.facturaId = facturaId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public PersonaEntidad getCliente() {
        return cliente;
    }

    public void setCliente(PersonaEntidad cliente) {
        this.cliente = cliente;
    }

    public List<DetalleProductoEntidad> getDetalleProductos() {
        return detalleProductos;
    }

    public void setDetalleProductos(List<DetalleProductoEntidad> detalleProductos) {
        this.detalleProductos = detalleProductos;
    }
}
