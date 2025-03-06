package org.example.exp;

public class BookNotFound extends RuntimeException {
    public BookNotFound(String message) {
        super(message);
    }
}
