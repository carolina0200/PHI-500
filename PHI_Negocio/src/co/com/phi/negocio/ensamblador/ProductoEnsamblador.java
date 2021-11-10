package co.com.phi.negocio.ensamblador;

import co.com.phi.dto.ProductoDTO;
import co.com.phi.entidad.ProductoEntidad;
import co.com.phi.negocio.dominio.Producto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductoEnsamblador {
    ProductoEntidad dominioAEntidad(Producto Producto);
    Producto entidadADominio(ProductoEntidad ProductoEntidad);

    ProductoDTO dominioADTO(Producto Producto);
    Producto DTOADominio(ProductoDTO ProductoDTO);

    List<Producto> entidadesADominios(Iterable<ProductoEntidad> ProductosEntidad);
    List<ProductoDTO> dominiosADTOs(List<Producto> Productos);

    List<Producto> DTOsADominios(List<ProductoDTO> ProductosDTO);
    List<ProductoEntidad> dominiosAEntidades(List<Producto> Productos);
}
