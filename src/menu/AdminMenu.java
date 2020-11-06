package menu;

import api.AdminResource;
import model.Room;
import model.RoomType;

import java.util.Scanner;

/**
 * Created by Wadek on 28/10/2020.
 */
public class AdminMenu {
    public static int navigateToMainMenu = 4;
    public static Scanner input;
    private static AdminResource adminResource;

    public static void startAdmin() {
        input = new Scanner(System.in);
        int selection = 0;

        while (selection != navigateToMainMenu) {
            selection = showAdminMenu();
            switch (selection) {
                case 0:
                    System.out.println(adminResource.getAllCustomers());
                    break;
                case 1:
                    System.out.println(adminResource.allRooms());
                    break;
                case 2:
                    adminResource.displayAllReservations();
                    break;
                case 3:
                    addRoom();

                case 4:
                    String[] arguments = new String[] {"123"};
                    MainMenu.main(arguments);
                default:
                    showAdminMenu();
                    break;
            }
        }
    }

    private static void addRoom() {
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Room Number:");
        room.roomNumber = scanner.nextLine().trim();
        System.out.println("Enter Room Price:");
        room.price = scanner.nextDouble();
        System.out.println("Choose Room Type: \n 1 -> SINGLE \n 2-> DOUBLE");
        int type = scanner.nextInt();
        if (type == 1) {
            room.roomType = RoomType.SINGLE;
        } else {
            room.roomType = RoomType.DOUBLE;
        }
        adminResource.addRoom(room);
    }

    private static int showAdminMenu() {
        String[] menus = new String[]{
                "Sea all Customers",
                "See all Rooms",
                "See all Reservations",
                "Add a Room",
                "Back to Main Menu"
        };
        for (int i = 0; i < menus.length; i++) {
            System.out.println(" " + i + " " + menus[i]);
        }
        System.out.println("...........................");
        System.out.println("Enter menu:");
        return input.nextInt();
    }

    public static void setAdminResource(AdminResource adminResource) {
        AdminMenu.adminResource = adminResource;
    }
}
