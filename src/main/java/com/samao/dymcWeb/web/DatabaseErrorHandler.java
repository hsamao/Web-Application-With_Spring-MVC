package com.samao.dymcWeb.web;


import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by hsamao on 10/22/15.
 */

@ControllerAdvice
public class DatabaseErrorHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException (DataAccessException ex) {

        return "error";
    }
}
