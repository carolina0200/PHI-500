package co.com.phi.api.controlador;

import co.com.phi.dto.ProductoDTO;
import co.com.phi.negocio.fachada.ProductoFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("producto")
public class ProductoControlador {

    @Autowired
    private ProductoFachada fachada;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> obtenerTodos() {
        return new ResponseEntity<>(fachada.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> porId(@PathVariable("id") Long id) {
        return new ResponseEntity<>(fachada.porId(id), HttpStatus.OK);
    }

    @PostMapping
    public void guardar(@RequestBody List<ProductoDTO> productos) {
        fachada.guardar(productos);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<ProductoDTO> nuevo(@RequestBody ProductoDTO producto) {
        return new ResponseEntity<>(fachada.nuevo(producto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        fachada.eliminar(id);
    }

}
