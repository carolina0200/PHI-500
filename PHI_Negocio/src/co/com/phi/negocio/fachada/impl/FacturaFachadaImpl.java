package co.com.phi.negocio.fachada.impl;

import co.com.phi.dto.FacturaDTO;
import co.com.phi.negocio.ensamblador.FacturaEnsamblador;
import co.com.phi.negocio.fachada.FacturaFachada;
import co.com.phi.negocio.negocio.FacturaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FacturaFachadaImpl implements FacturaFachada {

    @Autowired
    private FacturaNegocio negocio;

    @Autowired
    private FacturaEnsamblador ensamblador;

    @Override
    public String guardar(FacturaDTO facturaDTO) {
        return negocio.guardar(ensamblador.DTOADominio(facturaDTO));
    }

    @Override
    public List<FacturaDTO> porCliente(String identificaion) {
        return ensamblador.dominiosADTOs(negocio.porCliente(identificaion));
    }

    @Override
    public FacturaDTO porId(String id) {
        return ensamblador.dominioADTO(negocio.porId(id));
    }
}
