package menu;

import api.AdminResource;
import api.HotelResource;
import model.Customer;
import model.Room;
import model.RoomType;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Wadek on 26/10/2020.
 */
public class MainMenu {
    private static final AdminResource adminResource = new AdminResource();
    private static final HotelResource hotelResource = new HotelResource();
    public static int exitApp = 5;
    public static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int selection = 0;

        while (selection != exitApp) {
            selection = showMenu();
            switch (selection) {
                case 0:
                    findAndReserveRoom();
                    break;
                case 1:
                    seeMyReservations();
                    break;
                case 2:
                    createAccount();
                case 3:
                    AdminMenu.setAdminResource(adminResource);
                    AdminMenu.startAdmin();
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

    private static void seeMyReservations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Email:");
        String email = scanner.next();
        System.out.println(hotelResource.getCustomerReservations(email));
    }

    private static Customer createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer First Name:");
        String firstName = scanner.next();
        System.out.println("Enter Customer Last Name:");
        String lastName = scanner.next();
        System.out.println("Enter Customer Email:");
        String email = scanner.next();


        hotelResource.createACustomer(email, firstName, lastName);
        return new Customer(firstName, lastName, email);

    }

    private static void findAndReserveRoom() {
        Room room = new Room();
        room.roomType = RoomType.SINGLE;
        room.price = 12.0;
        room.roomNumber = "133";

        hotelResource.addRoom(room);
        hotelResource.getRoom("133");

        hotelResource.bookARoom(createAccount(), room, new Date(),
                new Date());
        System.out.println("Reservation was Created");
    }

    private static int showMenu() {
        String[] menus = new String[]{
                "Find and reserve a room",
                "See my reservations",
                "Create an account",
                "Admin",
                "Exit"
        };

        for (int i = 0; i < menus.length; i++) {
            System.out.println(" " + i + " " + menus[i]);
        }

        System.out.println("...........................");
        System.out.println("Enter menu:");
        return input.nextInt();
    }
}
