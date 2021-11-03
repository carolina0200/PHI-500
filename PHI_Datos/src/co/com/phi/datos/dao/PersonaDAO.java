package co.com.phi.datos.dao;

import co.com.phi.entidad.PersonaEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDAO extends CrudRepository<PersonaEntidad, String> {
}
