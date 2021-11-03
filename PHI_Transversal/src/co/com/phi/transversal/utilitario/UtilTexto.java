package co.com.phi.transversal.utilitario;

public class UtilTexto {

    private static final String BLANCO = "";

    private UtilTexto() { }

    public static String aplicarTrim(String cadena) {
        return obtenerValorDefecto(cadena, BLANCO).trim();
    }

    public static String obtenerValorDefecto(String cadena, String valorDefecto) {
        return UtilObjeto.obtenerValorDefecto(cadena, valorDefecto);
    }

    public static boolean cadenaEstaVaciaONula(String cadena) {
        return BLANCO.equals(aplicarTrim(cadena));
    }

}
