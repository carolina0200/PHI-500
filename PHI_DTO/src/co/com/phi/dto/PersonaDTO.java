package co.com.phi.dto;

import static co.com.phi.transversal.utilitario.UtilObjeto.obtenerValorDefecto;
import static co.com.phi.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;
import java.util.Date;

public class PersonaDTO {
    private String identificacion;
    private String nombreCompleto;
    private String celular;
    private String email;
    private Date fechaNacimiento;
    private int edad;

    public PersonaDTO() { }

    public PersonaDTO(String identificacion, String nombreCompleto, String celular, String email, Date fechaNacimiento, int edad) {
        setIdentificacion(identificacion);
        setNombreCompleto(nombreCompleto);
        setCelular(celular);
        setEmail(email);
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);
    }

    public static PersonaDTO crear() {
        return new PersonaDTO();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = aplicarTrim(identificacion);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = aplicarTrim(nombreCompleto);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = aplicarTrim(celular);
    }

    public String getEmail() {
        return email;
    }

    public PersonaDTO setEmail(String email) {
        this.email = aplicarTrim(email);
        return this;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public PersonaDTO setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = obtenerFechaDefecto(fechaNacimiento);
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public PersonaDTO setEdad(int edad) {
        this.edad = edad;
        return this;
    }
}
