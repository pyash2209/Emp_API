package com.springbootcrud_jdbc.springboot_jdbc.Exception;

import org.springframework.dao.DataAccessException;

public class GetByIdAccessException extends DataAccessException {
    public GetByIdAccessException(String message){
        super(message);
    }
}
