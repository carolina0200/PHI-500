package co.com.phi.negocio.negocio;

import co.com.phi.negocio.dominio.Producto;

import java.util.List;

public interface ProductoNegocio {
    List<Producto> obtenerTodos();
    Producto porId(Long id);
    void guardar(List<Producto> productos);
    Producto nuevo(Producto producto);
    void eliminar(Long id);
}
