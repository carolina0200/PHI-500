package co.com.phi.api.controlador;

import co.com.phi.dto.FacturaDTO;
import co.com.phi.negocio.fachada.FacturaFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("factura")
public class FacturaControlador {

    @Autowired
    private FacturaFachada facturaFachada;

    @GetMapping("/{id}")
    public ResponseEntity<FacturaDTO> PorId(@PathVariable("id") String id) {
        return new ResponseEntity<>(facturaFachada.porId(id), HttpStatus.OK);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<FacturaDTO>> PorCliente(@PathVariable("id") String id) {
        return new ResponseEntity<>(facturaFachada.porCliente(id), HttpStatus.OK);
    }

    @PostMapping
    public void guardar(@RequestBody FacturaDTO facturaDTO) {
        facturaFachada.guardar(facturaDTO);
    }

}
