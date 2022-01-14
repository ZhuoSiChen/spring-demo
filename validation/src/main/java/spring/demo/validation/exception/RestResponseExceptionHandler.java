package spring.demo.validation.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.RequestDispatcher;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


@Slf4j
@RestControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {


        request.setAttribute(RequestDispatcher.ERROR_MESSAGE,ex.getBindingResult().getAllErrors().get(0).getDefaultMessage(), WebRequest.SCOPE_REQUEST);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("test");
    }


}
