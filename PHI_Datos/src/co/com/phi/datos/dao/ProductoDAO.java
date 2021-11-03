package co.com.phi.datos.dao;

import co.com.phi.entidad.ProductoEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDAO extends CrudRepository<ProductoEntidad, Long> {
}
