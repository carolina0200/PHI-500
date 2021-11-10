package co.com.phi.api.excepcion;

import co.com.phi.transversal.utilitario.excepcion.TransversalExcepcion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.concurrent.ConcurrentHashMap;

@ControllerAdvice
public class ManejadorExcepcion extends ResponseEntityExceptionHandler {

    private static final ConcurrentHashMap<String, Integer> CODIGOS = new ConcurrentHashMap<>();

    public ManejadorExcepcion() {
        CODIGOS.put(TransversalExcepcion.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAll(RuntimeException exception) {
        Error error = new Error(exception.getMessage(), exception.getCause());
        return new ResponseEntity<>(error, HttpStatus.valueOf(CODIGOS.get(exception.getClass().getSimpleName())));
    }
}