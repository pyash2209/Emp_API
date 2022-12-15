package com.springbootcrud_jdbc.springboot_jdbc.Exception;

public class EntityAlreadyExistException extends RuntimeException {

    public EntityAlreadyExistException(String message){
        super(message);
    }
}
