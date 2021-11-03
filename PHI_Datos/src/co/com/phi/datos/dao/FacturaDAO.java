package co.com.phi.datos.dao;

import co.com.phi.entidad.FacturaEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDAO extends CrudRepository<FacturaEntidad, String> {

    Iterable<FacturaEntidad> findByClienteId(String clienteId);
}
