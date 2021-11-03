package co.com.phi.negocio.ensamblador;

import co.com.phi.dto.DetalleProductoDTO;
import co.com.phi.entidad.DetalleProductoEntidad;
import co.com.phi.negocio.dominio.DetalleProducto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProductoEnsamblador.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DetalleProductoEnsamblador {

    DetalleProductoEntidad dominioAEntidad(DetalleProducto detalleProducto);
    DetalleProducto entidadADominio(DetalleProductoEntidad detalleProductoEntidad);

    DetalleProductoDTO dominioADTO(DetalleProducto detalleProducto);
    DetalleProducto DTOADominio(DetalleProductoDTO detalleProductoDTO);

    List<DetalleProducto> entidadesADominios(Iterable<DetalleProductoEntidad> detalleProductosEntidad);
    List<DetalleProductoDTO> dominiosADTOs(List<DetalleProducto> detalleProductos);

    @AfterMapping
    default void after(@MappingTarget DetalleProductoEntidad detalleProductoEntidad, DetalleProducto detalleProducto) {
        detalleProductoEntidad.setProductoId(detalleProducto.getProducto().getProductoId());
    }
}
