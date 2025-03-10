package org.example;

import org.example.exp.ProfileIncorrectException;
import org.example.ui.Auth_UI;

public class Main {
    public static void main(String[] args) throws ProfileIncorrectException {
        new Auth_UI().start();
    }
}