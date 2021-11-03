package co.com.phi.transversal.mensaje.codigomensaje;

public class CodigosMensajes {

    private CodigosMensajes() {}

    public static class UtilFechaMensajes {
        private UtilFechaMensajes() {}

        public static final String MEN_USU_PROBLEMAS_FORMATEANDO_FECHA = "USUARIO_ERROR_00001_UtilFechaMensajes";
        public static final String MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA = "TECNICO_ERROR_00002_UtilFechaMensajes";
        public static final String MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO = "TECNICO_ERROR_00003_UtilFechaMensajes";
        public static final String MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO = "TECNICO_ERROR_00004_UtilFechaMensajes";
    }

    public static class CacheMensajeHelperMensajes {
        private CacheMensajeHelperMensajes() {}

        public static final String MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO = "USUARIO_ERROR_00001_CacheMensajeHelperMensajes";
        public static final String MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO = "TECNICO_ERROR_00002_CacheMensajeHelperMensajes";
        public static final String MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE = "USUARIO_ERROR_00003_CacheMensajeHelperMensajes";
        public static final String MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE = "TECNICO_ERROR_00004_CacheMensajeHelperMensajes";
    }

    public static class PersonaMensajes {
        private PersonaMensajes() {}

        public static final String MEN_USU_PERSONA_NO_EXISTE = "USUARIO_ERROR_00001_PersonaMensajes";
        public static final String MEN_TEC_PERSONA_NO_EXISTE = "TECNICO_ERROR_00002_PersonaMensajes";

    }
}
