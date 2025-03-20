package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.entities.ProfileEntity;

public class Genre_UI {

    public void start(ProfileEntity profile) {
        while (true) {
            switch (menu()){
                case 1 -> genreCreate(profile);
                case 2 -> genreUpdate(profile);
                case 3 -> genreRead();
                case 4 -> genreDelete(profile);
                case 0 -> {return;}
            }
        }
    }

    private void genreDelete(ProfileEntity profile) {

    }

    private void genreRead() {

    }

    private void genreUpdate(ProfileEntity profile) {

    }

    private void genreCreate(ProfileEntity profile) {

    }

    private int menu() {
        System.out.print("""
                +------  MENU  ------+
                | 1 | Genre Create   |
                | 2 | Genre Update   |
                | 3 | Genre Read     |
                | 4 | Genre Delete   |
                +--------------------+
                | 0 | Back           |
                +--------------------+
                | Enter Option ->""");
        return ScannerUtil.scanNUM.nextInt();
    }
}
