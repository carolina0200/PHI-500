package co.com.phi.transversal.utilitario;

import co.com.phi.transversal.mensaje.MensajeHelper;
import static co.com.phi.transversal.mensaje.codigomensaje.CodigosMensajes.UtilFechaMensajes;
import co.com.phi.transversal.utilitario.excepcion.TransversalExcepcion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilFecha {

    private static final String FECHA_DEFECTO = "01/01/1960";
    private static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";

    private UtilFecha() {}

    public static Date obtenerFechaDefecto(Date fecha, Date valorDefecto) {
        return UtilObjeto.obtenerValorDefecto(fecha, valorDefecto);
    }

    public static Date obtenerFechaDefecto(Date fecha) {
        return UtilObjeto.obtenerValorDefecto(fecha, obtenerFechaPorDefecto());
    }

    public static Date obtenerFechaActual() {
        return new Date();
    }

    public static Date obtenerFechaPorDefecto() {
        return formatearFecha(FECHA_DEFECTO, FORMATO_DD_MM_YYYY);
    }

    public static Date formatearFecha(String fechaTexto, String formato) {
        try {
            SimpleDateFormat formateador = new SimpleDateFormat(formato);
            return formateador.parse(fechaTexto);
        } catch (ParseException excepcion) {
            throw TransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA)
            );
        } catch (Exception excepcion) {
            throw TransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO)
            );
        }
    }

    public static int calcularAniosDiferencia(Date fechaInicial, Date fechaFinal) {
        return 0;
    }

    public static int calcularAniosDiferenciaContraFechaActual(Date fecha) {
        return calcularAniosDiferencia(fecha, obtenerFechaActual());
    }

}
