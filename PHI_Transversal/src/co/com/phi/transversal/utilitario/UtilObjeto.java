package co.com.phi.transversal.utilitario;

public class UtilObjeto {
    private UtilObjeto() { }

    public static <T> boolean objetoEsNulo(T objeto) {
        return objeto == null;
    }

    public static <T> T obtenerValorDefecto(T objeto, T valorDefecto) {
        return objetoEsNulo(objeto) ? valorDefecto : objeto;
    }
}
