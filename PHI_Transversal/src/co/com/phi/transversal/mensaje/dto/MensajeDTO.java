package co.com.phi.transversal.mensaje.dto;

import co.com.phi.transversal.mensaje.enumeraciones.CategoriaMensajeEnum;
import co.com.phi.transversal.mensaje.enumeraciones.TipoMensajeEnum;
import static co.com.phi.transversal.utilitario.UtilObjeto.obtenerValorDefecto;
import static co.com.phi.transversal.utilitario.UtilTexto.aplicarTrim;

public class MensajeDTO {

    private String codigo;
    private TipoMensajeEnum tipoMensaje;
    private CategoriaMensajeEnum categoriaMensaje;
    private String mensaje;

    public MensajeDTO(String codigo, TipoMensajeEnum tipoMensaje, CategoriaMensajeEnum categoriaMensaje, String mensaje) {
        setCodigo(codigo);
        setTipoMensaje(tipoMensaje);
        setCategoriaMensaje(categoriaMensaje);
        setMensaje(mensaje);
    }

    public static MensajeDTO crear(String codigo, TipoMensajeEnum tipoMensaje, CategoriaMensajeEnum categoriaMensaje, String mensaje) {
        return new MensajeDTO(codigo,tipoMensaje,categoriaMensaje,mensaje);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = aplicarTrim(codigo);
    }

    public TipoMensajeEnum getTipoMensaje() {
        return tipoMensaje;
    }

    private void setTipoMensaje(TipoMensajeEnum tipoMensaje) {
        this.tipoMensaje = obtenerValorDefecto(tipoMensaje, TipoMensajeEnum.USUARIO);
    }

    public CategoriaMensajeEnum getCategoriaMensaje() {
        return categoriaMensaje;
    }

    private void setCategoriaMensaje(CategoriaMensajeEnum categoriaMensaje) {
        this.categoriaMensaje = obtenerValorDefecto(categoriaMensaje, CategoriaMensajeEnum.ERROR);
    }

    public String getMensaje() {
        return mensaje;
    }

    private void setMensaje(String mensaje) {
        this.mensaje = aplicarTrim(mensaje);
    }
}
