package co.com.phi.negocio.fachada.impl;

import co.com.phi.dto.PersonaDTO;
import co.com.phi.negocio.ensamblador.PersonaEnsamblador;
import co.com.phi.negocio.fachada.PersonaFachada;
import co.com.phi.negocio.negocio.PersonaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaFachadaImpl implements PersonaFachada {

    @Autowired
    private PersonaNegocio personaNegocio;

    @Autowired
    private PersonaEnsamblador ensamblador;

    @Override
    public String guardar(PersonaDTO personaDTO) {
        personaNegocio.guardar(ensamblador.DTOADominio(personaDTO));
        return personaDTO.getIdentificacion();
    }

    @Override
    public PersonaDTO obtenerPorId(String identificacion) {
        return ensamblador.dominioADTO(personaNegocio.obtenerPorId(identificacion));
    }
}
