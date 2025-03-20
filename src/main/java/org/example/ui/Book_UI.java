package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.entities.ProfileEntity;

public class Book_UI {

    public void start(ProfileEntity profile) {
        while (true){
            switch (menu()){
                case 1 -> addBook(profile);
                case 2 -> showBook();
                case 3 -> editBook(profile);
                case 4 -> deleteBook(profile);
                case 0 -> {
                    return;
                }
            }
        }

    }

    private void deleteBook(ProfileEntity profile) {
    }

    private void editBook(ProfileEntity profile) {

    }

    private void showBook() {

    }

    private void addBook(ProfileEntity profile) {

    }

    private int menu() {
        System.out.print("""
                +------  MENU  ------+
                | 1 | Add Book       |
                | 2 | Show Book      |
                | 3 | Edit Book      |
                | 4 | Delete Book    |
                +--------------------+
                | 0 | Back           |
                +--------------------+
                | Enter Option ->""");
        return ScannerUtil.scanNUM.nextInt();
    }
}
