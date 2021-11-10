package co.com.phi.transversal.utilitario.validador;

import co.com.phi.transversal.mensaje.MensajeHelper;
import co.com.phi.transversal.utilitario.excepcion.TransversalExcepcion;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
    private Validador() {}

    public static void obligatorio(Object valor, String mensajeTecnico, String mensajeUsuario) {
        if (valor == null) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void longitud(String valor,int longitud,String mensajeTecnico, String mensajeUsuario){
        if(valor.length() < longitud){
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static <T> void noVacio(List<T> lista, String mensajeTecnico, String mensajeUsuario) {
        if (lista.isEmpty()) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void positivo(long valor, String mensajeTecnico, String mensajeUsuario) {
        if (valor <= 0) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void igual(Double valor, Double valorEsperado, String mensajeTecnico, String mensajeUsuario) {
        if (!valor.equals(valorEsperado)) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void longitudMinima(Object valor, int longitudMinima, String mensajeTecnico, String mensajeUsuario) {
        if (valor.toString().length() < longitudMinima) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void menor(Long numeroInicial, Long numeroFinal, String mensajeTecnico, String mensajeUsuario) {
        if (numeroInicial > numeroFinal) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }

    public static void regex(String correoElectronico, String regex, String mensajeTecnico, String mensajeUsuario) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correoElectronico);

        if (!matcher.matches()) {
            throw TransversalExcepcion.crear(MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeUsuario),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(mensajeTecnico));
        }
    }
}
