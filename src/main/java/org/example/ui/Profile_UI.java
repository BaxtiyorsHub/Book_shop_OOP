package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.controller.Profile_Controller;
import org.example.entities.ProfileEntity;
import org.example.enums.ProfileRole;
import org.example.exp.ProfileIncorrectException;
import org.example.requests.ProfileRequest;

public class Profile_UI {

    private Profile_Controller profile_controller = new Profile_Controller();
    private Book_UI bookUi = new Book_UI();
    private Genre_UI genreUi = new Genre_UI();
    private Region_UI regionUi = new Region_UI();

    private void adminStart(ProfileEntity profile) {
        while (true) {
            switch (menu()){
                case 1 -> bookUi.start(profile);
                case 2 -> genreUi.start(profile);
                case 3 -> regionUi.start(profile);
                case 4 -> showProfiles();
                case 5 -> salesHistory();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void salesHistory() {

    }

    private void showProfiles() {

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
                case 1 -> searchBook();
                case 2 -> showBook();
                case 3 -> buyBook(login);
                case 4 -> ownSales(login);
                case 5 -> changePass(login);
                case 6 -> fillBalance(login);
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void fillBalance(ProfileEntity login) {

    }

    private void changePass(ProfileEntity login) {

    }

    private void ownSales(ProfileEntity login) {

    }

    private void buyBook(ProfileEntity login) {

    }

    private void showBook() {

    }

    private void searchBook() {

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

    public void register(ProfileRequest request) throws ProfileIncorrectException {
        System.out.println(profile_controller.register(request));
    }

    public void login(String phone, String password) throws ProfileIncorrectException {
        ProfileEntity login = profile_controller.login(phone, password);
        boolean equals = login.getRole().equals(ProfileRole.ADMIN);
        if (equals) adminStart(login);
        userStart(login);
    }
}
