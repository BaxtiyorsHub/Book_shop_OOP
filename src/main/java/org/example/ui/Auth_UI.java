package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.requests.ProfileRequest;

public class Auth_UI {

    private Profile_UI profileUi = new Profile_UI();

    public void start() {
        while (true) {
            switch (menu()){
                case 1 -> login();
                case 2 -> register();
                case 0 -> {return;}

            }
        }
    }
    public void login() {

    }

    public void register() {
        System.out.println("--Registration--");
        System.out.println("Enter your name: ");
        String name = ScannerUtil.scanSRT.next();
        System.out.println("Enter your phone: ");
        String phone = ScannerUtil.scanSRT.next();
        System.out.println("Enter your password: ");
        String password = ScannerUtil.scanSRT.next();
        System.out.println("Enter your age: ");
        Short age = ScannerUtil.scanSRT.nextShort();
        ProfileRequest request = new ProfileRequest(name, phone, password, age);
        profileUi.register(request);

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
