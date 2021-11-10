package co.com.phi.negocio.negocio.impl;

import co.com.phi.datos.dao.ProductoDAO;
import co.com.phi.negocio.dominio.Producto;
import co.com.phi.negocio.ensamblador.ProductoEnsamblador;
import co.com.phi.negocio.negocio.ProductoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductoNegocioImpl implements ProductoNegocio {

    @Autowired
    private ProductoDAO productoDAO;

    @Autowired
    private ProductoEnsamblador ensamblador;

    @Override
    public List<Producto> obtenerTodos() {
        return ensamblador.entidadesADominios(productoDAO.findAll());
    }

    @Override
    public Producto porId(Long id) {
        return ensamblador.entidadADominio(productoDAO.findById(id).orElseGet(null));
    }

    @Override
    public void guardar(List<Producto> productos) {
        productos.forEach(producto -> producto.setActualizacion(new Date()));
        productoDAO.saveAll(ensamblador.dominiosAEntidades(productos));
    }

    @Override
    public Producto nuevo(Producto producto) {
        producto.setActualizacion(new Date());
        return ensamblador.entidadADominio(productoDAO.save(ensamblador.dominioAEntidad(producto)));
    }

    @Override
    public void eliminar(Long id) {
        productoDAO.deleteById(id);
    }
}
