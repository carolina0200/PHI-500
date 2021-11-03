package co.com.phi.negocio.ensamblador;

import co.com.phi.dto.FacturaDTO;
import co.com.phi.entidad.FacturaEntidad;
import co.com.phi.negocio.dominio.Factura;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {PersonaEnsamblador.class, DetalleProductoEnsamblador.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FacturaEnsamblador {

    FacturaEntidad dominioAEntidad(Factura factura);
    Factura entidadADominio(FacturaEntidad facturaEntidad);

    FacturaDTO dominioADTO(Factura factura);
    Factura DTOADominio(FacturaDTO facturaDTO);

    List<Factura> entidadesADominios(Iterable<FacturaEntidad> facturasEntidad);
    List<FacturaDTO> dominiosADTOs(List<Factura> facturas);

    @AfterMapping
    default void after(@MappingTarget FacturaEntidad facturaEntidad, Factura factura) {

    }
}
