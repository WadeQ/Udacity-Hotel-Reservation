package menu;

import java.util.Scanner;

/**
 * Created by Wadek on 26/10/2020.
 */
public class MainMenu {
    public static int exitApp = 4;
    public static Scanner input;

    public static void main(String[] args){
        input = new Scanner(System.in);
        int selection = 0;

        while (selection != exitApp){
            selection = showMenu();
            switch (selection){
                case 0:
                case 1:
                    doSomething(selection);
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                default:
                    showMenu();
                    break;
            }
        }
    }

    private static int showMenu() {
        String[] menus = new String[] {
                "Find and reserve a room",
                "See my reservations",
                "Create an account",
                "Admin",
                "Exit"
        };
        for (int i = 0; i < menus.length; i++){
            System.out.println(" "+ i +" "+menus[i]);
        }
        System.out.println("...........................");
        System.out.println("Enter menu:");
        return input.nextInt();
    }

    private static void doSomething(int selection){
        System.out.println("Menu selected: " + selection);
    }
}
