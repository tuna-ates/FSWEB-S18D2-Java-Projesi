package com.workintech.s18d2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler
    public ResponseEntity<FruitErrorResponse> handlerError(FruitException fruitException){
        FruitErrorResponse fruitErrorResponse=new FruitErrorResponse(fruitException.getMessage());
        log.error("exception accourd:",fruitException.getMessage());
        return new ResponseEntity<>(fruitErrorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<FruitErrorResponse> handlerError(Exception exception){
        FruitErrorResponse fruitErrorResponse=new FruitErrorResponse(exception.getMessage());
        log.error("exception accourd:",exception.getMessage());
        return new ResponseEntity<>(fruitErrorResponse, HttpStatus.BAD_REQUEST);
    }

}
