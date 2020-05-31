package me.voson.demo;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(DuplicateKeyException.class)
    public CommonResponse<?> handleDuplicateKeyException(DuplicateKeyException e) {
        return CommonResponse.fail("DUPLICATE_KEY", e.getMostSpecificCause().getMessage());
    }
}
