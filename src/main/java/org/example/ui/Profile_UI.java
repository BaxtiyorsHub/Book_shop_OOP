package org.example.ui;

import org.example.ScannerUtil.ScannerUtil;

public class Profile_UI {

    public void start() {
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
}
