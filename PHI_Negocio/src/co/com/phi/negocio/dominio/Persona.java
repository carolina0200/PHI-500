package co.com.phi.negocio.dominio;
import co.com.phi.transversal.utilitario.UtilFecha;

import java.util.Date;

import static co.com.phi.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class Persona {
    private String identificacion;
    private String nombreCompleto;
    private String celular;
    private String email;
    private Date fechaNacimiento;

    public Persona() { }

    public Persona(String identificacion, String nombreCompleto, String celular, String email, Date fechaNacimiento) {
        setIdentificacion(identificacion);
        setNombreCompleto(nombreCompleto);
        setCelular(celular);
        setEmail(email);
        setFechaNacimiento(fechaNacimiento);
    }

    public static Persona crear() {
        return new Persona();
    }

    public int getEdad() {
        return UtilFecha.calcularAniosDiferenciaContraFechaActual(fechaNacimiento);
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
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = aplicarTrim(email);
        return this;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = obtenerFechaDefecto(fechaNacimiento);
        return this;
    }

}
