package co.com.phi.api.controlador;

import co.com.phi.dto.PersonaDTO;
import co.com.phi.negocio.fachada.PersonaFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaControlador {

    @Autowired
    private PersonaFachada personaFachada;

    @GetMapping("/{identificacion}")
    public ResponseEntity<PersonaDTO> personaPorIdentificacion(@PathVariable("identificacion") String identificacion) {
        return new ResponseEntity<>(personaFachada.obtenerPorId(identificacion), HttpStatus.OK);
    }

    @PostMapping
    public void guardar(@RequestBody PersonaDTO personaDTO) {
        personaFachada.guardar(personaDTO);
    }

}
