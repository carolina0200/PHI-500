package co.com.phi.transversal.mensaje.implementacion;

import co.com.phi.transversal.mensaje.codigomensaje.CodigosMensajes;
import co.com.phi.transversal.mensaje.dto.MensajeDTO;
import co.com.phi.transversal.mensaje.enumeraciones.CategoriaMensajeEnum;
import co.com.phi.transversal.mensaje.MensajeHelper;

import co.com.phi.transversal.mensaje.enumeraciones.TipoMensajeEnum;
import co.com.phi.transversal.utilitario.UtilTexto;
import co.com.phi.transversal.utilitario.excepcion.TransversalExcepcion;

import java.util.HashMap;
import java.util.Map;

public class CacheMensajeHelper extends MensajeHelper {

    private static final CacheMensajeHelper INSTANCIA = new CacheMensajeHelper();
    private static final Map<String, MensajeDTO> MAPA_MENSAJES = new HashMap<>();

    private CacheMensajeHelper() {
        cargarMensajes();
    }

    private void cargarMensajes() {
        MAPA_MENSAJES.put(CodigosMensajes.UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA,
                MensajeDTO.crear(CodigosMensajes.UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar acabo la operacion deseada especificamente tratando de formatear la fecha"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA,
                MensajeDTO.crear(CodigosMensajes.UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema, tratando de formatear la fecha, porfavor verifique la excepcion"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                MensajeDTO.crear(CodigosMensajes.UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema inesperado, tratando de formatear la fecha"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                MensajeDTO.crear(CodigosMensajes.UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema inesperado, tratando de formatear la fecha, porfavor verifique la excepcion y controlela"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                MensajeDTO.crear(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar a cabo la operación, se intento obtener el mensaje con datos incosistentes"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                MensajeDTO.crear(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando recuperar un mensaje desde cache con un codigo nulo o vacio"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                MensajeDTO.crear(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar a cabo la operación, se intento obtener el mensaje con codigo incorrecto"
                )
        );
        MAPA_MENSAJES.put(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                MensajeDTO.crear(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando recuperar un mensaje desde cache con un codigo que no existe"
                )
        );

        MAPA_MENSAJES.put(CodigosMensajes.PersonaMensajes.MEN_TEC_PERSONA_NO_EXISTE,
                MensajeDTO.crear(CodigosMensajes.PersonaMensajes.MEN_TEC_PERSONA_NO_EXISTE,
                TipoMensajeEnum.TECNICO,
                CategoriaMensajeEnum.INFORMACION,
                "La persona que desea encontrar no existe con esa identificación"
                )
        );

        MAPA_MENSAJES.put(CodigosMensajes.PersonaMensajes.MEN_USU_PERSONA_NO_EXISTE,
                MensajeDTO.crear(CodigosMensajes.PersonaMensajes.MEN_USU_PERSONA_NO_EXISTE,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.INFORMACION,
                        "La persona que desea encontrar no existe con esa identificación"
                )
        );

    }

    public static CacheMensajeHelper obtenerCacheMensajeHelper() {
        return INSTANCIA;
    }

    @Override
    public MensajeDTO obtenerMensaje(String codigo) {
        if (UtilTexto.cadenaEstaVaciaONula(codigo)) {
            throw TransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO)
            );
        }

        if(MAPA_MENSAJES.containsKey(codigo)) {
            throw TransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CodigosMensajes.CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE)
            );
        }

        return MAPA_MENSAJES.get(codigo);
    }

    @Override
    public String obtenerTextoMensaje(String codigo) {
        return obtenerMensaje(codigo).getMensaje();
    }
}
