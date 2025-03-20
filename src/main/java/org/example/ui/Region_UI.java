package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;
import org.example.entities.ProfileEntity;

public class Region_UI {

    public void start(ProfileEntity profile) {
        while (true){
            switch (menu()){
                case 1 -> regionCreate(profile);
                case 2 -> regionUpdate(profile);
                case 3 -> regionRead();
                case 4 -> regionDelete(profile);
                case 5 -> regionList();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void regionList() {

    }

    private void regionDelete(ProfileEntity profile) {

    }

    private void regionRead() {

    }

    private void regionUpdate(ProfileEntity profile) {

    }

    private void regionCreate(ProfileEntity profile) {

    }

    private int menu() {
        System.out.print("""
                +------  MENU  ------+
                | 1 | Region Create  |
                | 2 | Region Update  |
                | 3 | Region Read    |
                | 4 | Region Delete  |
                | 5 | Region List    |
                +--------------------+
                | 0 | Back           |
                +--------------------+
                | Enter Option ->""");
        return ScannerUtil.scanNUM.nextInt();
    }
}
