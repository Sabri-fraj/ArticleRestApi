package net.codejava.Controller;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleExp {

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String handleNoElement() {
        return "Cannot find element by this Id";
    }

}