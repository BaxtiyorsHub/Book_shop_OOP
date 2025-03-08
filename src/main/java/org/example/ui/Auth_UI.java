package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;

public class Auth_UI {

    public void start() {
        while (true) {
            switch (menu()){
                case 1 -> login();
                case 2 -> register();
                case 0 -> {return;}

            }
        }
    }
    public static void login() {

    }

    public static void register() {
        System.out.println("--Registration--");
        System.out.println("Enter your name: ");
    }
    private int menu(){
        System.out.println("""
                |---- MENU ----|
                | 1 | LOG-IN   |
                | 2 | REGISTER |
                |--------------|
                | 0 | LOGOUT   |
                |--------------|
                | ENTER OPTION :""");
        return ScannerUtil.scanNUM.nextInt();
    }

}
