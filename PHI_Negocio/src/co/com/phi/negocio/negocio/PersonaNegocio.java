package co.com.phi.negocio.negocio;
import co.com.phi.negocio.dominio.Persona;

public interface PersonaNegocio {
    void guardar(Persona persona);
    Persona obtenerPorId(String identificacion);
}
