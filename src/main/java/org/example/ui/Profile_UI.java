package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.controller.Profile_Controller;
import org.example.entities.ProfileEntity;
import org.example.enums.ProfileRole;
import org.example.exp.ProfileIncorrectException;
import org.example.requests.ProfileRequest;

public class Profile_UI {

    private Profile_Controller profile_controller = new Profile_Controller();

    private void adminStart(ProfileEntity profile) {
        while (true) {
            switch (menu()){

            }
        }
    }




    private int menu() {
        System.out.print("""
                +------  MENU  ------+
                | 1 | Book Section   |
                | 2 | Genre Section  |
                | 3 | Region Section |
                | 4 | Show Profiles  |
                | 5 | Sales History  |
                +--------------------+
                | 0 | Exit           |
                +--------------------+
                | Enter Option ->""");
        return ScannerUtil.scanNUM.nextInt();
    }


    private void userStart(ProfileEntity login) {
        while (true) {
            switch (userMenu()){

            }
        }
    }

    private int userMenu() {
        System.out.print("""
                +------  MENU  -------+
                | 1 | Search Book     |
                | 2 | Show Book       |
                | 3 | Buy Book        |
                | 4 | Show own Sales  |
                | 5 | Change Password |
                | 6 | Fill Balance    |
                +---------------------+
                | 0 | Exit            |
                +---------------------+
                | Enter Option ->""");
        return ScannerUtil.scanNUM.nextInt();
    }

    public String register(ProfileRequest request) throws ProfileIncorrectException {
        return profile_controller.register(request);
    }

    public void login(String phone, String password) throws ProfileIncorrectException {
        ProfileEntity login = profile_controller.login(phone, password);
        boolean equals = login.getRole().equals(ProfileRole.ADMIN);
        if (equals) adminStart(login);
        userStart(login);
    }
}
