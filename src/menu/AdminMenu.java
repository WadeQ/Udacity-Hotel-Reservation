package menu;

import java.util.Scanner;

/**
 * Created by Wadek on 28/10/2020.
 */
public class AdminMenu {
    public static int navigateToMainMenu = 4;
    public static Scanner input;

    public static void main(String[] args){
        input = new Scanner(System.in);
        int selection = 0;

        while (selection != navigateToMainMenu){
            selection = showAdminMenu();
            switch (selection){
                case 0:
                case 1:
                    doSomething(selection);
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                default:
                    showAdminMenu();
                    break;
            }
        }
    }

    private static int showAdminMenu() {
        String[] menus = new String[] {
                "Sea all Customers",
                "See all Rooms",
                "See all Reservations",
                "Add a Room",
                "Back to Main Menu"
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
