package co.com.phi.negocio.ensamblador;

import co.com.phi.dto.PersonaDTO;
import co.com.phi.entidad.PersonaEntidad;
import co.com.phi.negocio.dominio.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonaEnsamblador {
    PersonaEntidad dominioAEntidad(Persona persona);
    Persona entidadADominio(PersonaEntidad personaEntidad);

    PersonaDTO dominioADTO(Persona persona);
    Persona DTOADominio(PersonaDTO personaDTO);

}
