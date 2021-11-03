package co.com.phi.negocio.fachada;

import co.com.phi.dto.FacturaDTO;

import java.util.List;

public interface FacturaFachada {
    public String guardar(FacturaDTO facturaDTO);
    public List<FacturaDTO> porCliente(String identificaion);
    public FacturaDTO porId(String id);
}
