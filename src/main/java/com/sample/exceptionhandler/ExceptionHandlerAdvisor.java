package com.sample.exceptionhandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.xml.ws.Response;

@ControllerAdvice
public class ExceptionHandlerAdvisor {

     @ExceptionHandler
     public ResponseEntity<String> catchError(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
        return  new ResponseEntity<String>("例外が発生しました。",null,HttpStatus.INTERNAL_SERVER_ERROR);
     }
}
