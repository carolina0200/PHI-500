package co.com.phi.negocio.fachada;

import co.com.phi.dto.PersonaDTO;

import java.util.List;

public interface PersonaFachada {
    String guardar(PersonaDTO personaDTO);
    PersonaDTO obtenerPorId(String identificacion);
}
