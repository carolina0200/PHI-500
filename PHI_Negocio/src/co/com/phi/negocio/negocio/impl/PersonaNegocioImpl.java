package co.com.phi.negocio.negocio.impl;

import co.com.phi.datos.dao.PersonaDAO;
import co.com.phi.entidad.PersonaEntidad;
import co.com.phi.negocio.dominio.Persona;
import co.com.phi.negocio.ensamblador.PersonaEnsamblador;
import co.com.phi.negocio.negocio.PersonaNegocio;
import co.com.phi.transversal.mensaje.MensajeHelper;
import co.com.phi.transversal.mensaje.codigomensaje.CodigosMensajes;
import co.com.phi.transversal.utilitario.excepcion.TransversalExcepcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaNegocioImpl implements PersonaNegocio {

    @Autowired
    private PersonaDAO personaDAO;

    @Autowired
    private PersonaEnsamblador ensamblador;

    @Override
    public void guardar(Persona persona) {
        personaDAO.save(ensamblador.dominioAEntidad(persona));
    }

    @Override
    public Persona obtenerPorId(String identificacion) {
        try {
            PersonaEntidad personaEntidad = personaDAO.findById(identificacion).get();
            return ensamblador.entidadADominio(personaEntidad);
        } catch (Exception excepcion) {
            throw TransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.PersonaMensajes.MEN_TEC_PERSONA_NO_EXISTE),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.PersonaMensajes.MEN_USU_PERSONA_NO_EXISTE)
            );
        }
    }
}
