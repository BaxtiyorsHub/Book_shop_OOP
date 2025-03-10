package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.exp.ProfileIncorrectException;
import org.example.requests.ProfileRequest;

public class Auth_UI {

    private Profile_UI profileUi = new Profile_UI();

    public void start() throws ProfileIncorrectException {
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

    public void register() throws ProfileIncorrectException {
        System.out.println("--Registration--");
        System.out.print("Enter your name: ");
        String name = ScannerUtil.scanSRT.next();
        System.out.print("Enter your phone: ");
        String phone = ScannerUtil.scanSRT.next();
        System.out.print("Enter your password: ");
        String password = ScannerUtil.scanSRT.next();
        System.out.print("Enter your age: ");
        Short age = ScannerUtil.scanSRT.nextShort();
        ProfileRequest request = new ProfileRequest(name, phone, password, age);
        profileUi.register(request);

    }
    private int menu(){
        System.out.print("""
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
