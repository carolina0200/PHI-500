package co.com.phi.negocio.fachada;

import co.com.phi.dto.ProductoDTO;

import java.util.List;

public interface ProductoFachada {
    List<ProductoDTO> obtenerTodos();
    ProductoDTO porId(Long id);
    void guardar(List<ProductoDTO> productoDTOS);
    ProductoDTO nuevo(ProductoDTO productoDTO);
    void eliminar(Long id);
}
