package co.com.phi.entidad;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaEntidad {

    @Id
    private String identificacion;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    private String celular;

    private String email;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;


    public PersonaEntidad() { }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
