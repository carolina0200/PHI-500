package co.com.phi.negocio.negocio;

import co.com.phi.negocio.dominio.Factura;

import java.util.List;

public interface FacturaNegocio {
    public String guardar(Factura factura);
    public List<Factura> porCliente(String identificaion);
    public Factura porId(String id);
}
