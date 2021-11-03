package co.com.phi.datos.dao;

import co.com.phi.entidad.DetalleProductoEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProductoDAO extends CrudRepository<DetalleProductoEntidad, Integer> {
}
