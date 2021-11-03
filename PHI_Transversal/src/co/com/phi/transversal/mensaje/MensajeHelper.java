package co.com.phi.transversal.mensaje;

import co.com.phi.transversal.mensaje.dto.MensajeDTO;
import co.com.phi.transversal.mensaje.enumeraciones.MensajeHelperEnum;
import co.com.phi.transversal.mensaje.implementacion.CacheMensajeHelper;

public abstract class MensajeHelper {
    public static MensajeHelperEnum ESTRATEGIA = MensajeHelperEnum.CACHE;
    public static MensajeHelper obtenerMensajeHelper() {
        MensajeHelper mensajeHelper = CacheMensajeHelper.obtenerCacheMensajeHelper();

        /* switch (ESTRATEGIA) {
            case ARCHIVO, BASE_DATOS, SERVICIO_WEB, CACHE:
                mensajeHelper = CacheMensajeHelper.obtenerCacheMensajeHelper();
                break;
        } */

        return mensajeHelper;
    }

    public abstract MensajeDTO obtenerMensaje(String codigo);

    public abstract String obtenerTextoMensaje(String codigo);
}
