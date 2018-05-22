package com.java21days;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative Number");
    }
    
    public NegativeNumberException(String message) {
        super(message);
    }
}