package dev.phatbeau.watchstore.exceptions;

public class ExistedProductException extends IllegalArgumentException{
    public ExistedProductException(String message) {
        super(message);
    }
}
