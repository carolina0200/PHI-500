package co.com.phi.negocio.negocio.impl;

import co.com.phi.datos.dao.FacturaDAO;
import co.com.phi.negocio.dominio.Factura;
import co.com.phi.negocio.ensamblador.FacturaEnsamblador;
import co.com.phi.negocio.negocio.FacturaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FacturaNegocioImpl implements FacturaNegocio {

    @Autowired
    private FacturaDAO facturaDAO;

    @Autowired
    private FacturaEnsamblador ensamblador;

    @Override
    public String guardar(Factura factura) {
        factura.setFecha(new Date());
        factura.setFacturaId(String.valueOf(new Date().getTime()));
        factura.getDetalleProductos().stream().forEach(
                detalleProducto -> detalleProducto.setFacturaId(factura.getFacturaId())
        );
        facturaDAO.save(ensamblador.dominioAEntidad(factura));
        return factura.getFacturaId();
    }

    @Override
    public List<Factura> porCliente(String identificaion) {
        return ensamblador.entidadesADominios(facturaDAO.findByClienteId(identificaion));
    }

    @Override
    public Factura porId(String id) {
        return ensamblador.entidadADominio(facturaDAO.findById(id).orElseThrow());
    }
}
