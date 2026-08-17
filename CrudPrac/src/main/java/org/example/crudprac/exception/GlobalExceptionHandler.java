package org.example.crudprac.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.example.crudprac.dto.GlobalHandlerDto;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<GlobalHandlerDto> handleResourceNotFoundException(ResourceNotFoundException ex,
                                                                            HttpServletRequest request){
        GlobalHandlerDto dto = new GlobalHandlerDto(
                LocalDateTime.now(),
        HttpRequest.NOT_FOUND.value(),
        HttpRequest.NOT_FOUND.getMessagePhrase(),
         ex.getMessage(),
        request.getRequestURI(),

        );
        return   ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(dto);

    }
}
