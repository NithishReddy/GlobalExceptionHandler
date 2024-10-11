package com.example.globalexception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@ControllerAdvice
public class ControllerDeviceClass {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> getResourceNotFoundException(ResourceNotFoundException ex){
        System.out.println("***************** Global Exception Handler Calling");
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), "");
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
