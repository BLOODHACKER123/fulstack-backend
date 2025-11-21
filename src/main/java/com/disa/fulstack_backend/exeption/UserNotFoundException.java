package com.disa.fulstack_backend.exeption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found the user id"+id);
    }
}
