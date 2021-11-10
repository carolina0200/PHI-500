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

    public static class ProductoMensajes {
        private ProductoMensajes() {}

        public static final String MEN_USU_NOMBRE_OBLIGATORIO = "USUARIO_ERROR_00001_ProductoMensajes";
        public static final String MEN_TEC_NOMBRE_OBLIGATORIO = "TECNICO_ERROR_00002_ProductoMensajes";

        public static final String MEN_USU_PRECIO_OBLIGATORIO = "USUARIO_ERROR_00003_ProductoMensajes";
        public static final String MEN_TEC_PRECIO_OBLIGATORIO = "TECNICO_ERROR_00004_ProductoMensajes";

        public static final String MEN_USU_CANTIDAD_OBLIGATORIA = "USUARIO_ERROR_00005_ProductoMensajes";
        public static final String MEN_TEC_CANTIDAD_OBLIGATORIA = "TECNICO_ERROR_00006_ProductoMensajes";

        public static final String MEN_USU_NOMBRE_MAX_LONG = "USUARIO_ERROR_00007_ProductoMensajes";
        public static final String MEN_TEC_NOMBRE_MAX_LONG = "TECNICO_ERROR_00008_ProductoMensajes";

        public static final String MEN_USU_PRECIO_POSITIVO = "USUARIO_ERROR_00009_ProductoMensajes";
        public static final String MEN_TEC_PRECIO_POSITIVO = "TECNICO_ERROR_00010_ProductoMensajes";

        public static final String MEN_USU_CANTIDAD_POSITIVA = "USUARIO_ERROR_00011_ProductoMensajes";
        public static final String MEN_TEC_CANTIDAD_POSITIVA = "TECNICO_ERROR_00012_ProductoMensajes";

    }
}
