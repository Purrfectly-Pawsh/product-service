package de.htw.productmicroservice.port.user.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class IllegalArgumentAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    String illegalArgumentException(IllegalArgumentException e) {
        return e.getMessage();
    }

}
