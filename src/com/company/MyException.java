package com.company;


public class MyException extends RuntimeException{


    public MyException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
