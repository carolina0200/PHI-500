package co.com.phi.transversal.utilitario.excepcion;

import co.com.phi.transversal.utilitario.UtilObjeto;
import co.com.phi.transversal.utilitario.UtilTexto;

public class TransversalExcepcion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String mensajeUsuario;
    private String mensajeTecnico;
    private Throwable excepcionRaiz;

    private TransversalExcepcion(String mensajeUsuario, String mensajeTecnico, Throwable excepcionRaiz) {
        setMensajeUsuario(mensajeUsuario);
        setMensajeTecnico(mensajeTecnico);
        setExcepcionRaiz(excepcionRaiz);
    }

    public static TransversalExcepcion crear(String mensajeUsuario, String mensajeTecnico, Throwable excepcionRaiz) {
        return new TransversalExcepcion(mensajeUsuario, mensajeTecnico, excepcionRaiz);
    }

    public static TransversalExcepcion crear(String mensajeUsuario, String mensajeTecnico) {
        return new TransversalExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    private void setMensajeUsuario(String mensajeUsuario) {
        this.mensajeUsuario = UtilTexto.aplicarTrim(mensajeUsuario);
    }

    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

    private void setMensajeTecnico(String mensajeTecnico) {
        this.mensajeTecnico = UtilTexto.aplicarTrim(mensajeTecnico);
    }

    public Throwable getExcepcionRaiz() {
        return excepcionRaiz;
    }

    private void setExcepcionRaiz(Throwable excepcionRaiz) {
        this.excepcionRaiz = UtilObjeto.obtenerValorDefecto(excepcionRaiz, new Exception());
    }
}
