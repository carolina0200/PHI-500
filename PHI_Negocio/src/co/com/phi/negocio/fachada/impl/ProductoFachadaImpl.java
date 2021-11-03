package co.com.phi.negocio.fachada.impl;

import co.com.phi.dto.ProductoDTO;
import co.com.phi.negocio.ensamblador.ProductoEnsamblador;
import co.com.phi.negocio.fachada.ProductoFachada;
import co.com.phi.negocio.negocio.ProductoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductoFachadaImpl implements ProductoFachada {

    @Autowired
    private ProductoNegocio negocio;

    @Autowired
    private ProductoEnsamblador ensamblador;


    @Override
    public List<ProductoDTO> obtenerTodos() {
        return ensamblador.dominiosADTOs(negocio.obtenerTodos());
    }

    @Override
    public ProductoDTO porId(Long id) {
        return ensamblador.dominioADTO(negocio.porId(id));
    }

    @Override
    public void guardar(List<ProductoDTO> productoDTOS) {
        negocio.guardar(ensamblador.DTOsADominios(productoDTOS));
    }

    @Override
    public ProductoDTO nuevo(ProductoDTO productoDTO) {
        return ensamblador.dominioADTO(negocio.nuevo(ensamblador.DTOADominio(productoDTO)));
    }

    @Override
    public void eliminar(Long id) {
        negocio.eliminar(id);
    }
}
