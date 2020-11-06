package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Wadek on 26/10/2020.
 */
public class AdminResource {
    private static final CustomerService customerService = new CustomerService();
    private static final ReservationService reservationService = new ReservationService();


    public void addCustomer(String email, String firstName, String lastName) {
        customerService.addCustomer(email, firstName, lastName);
    }

    public Customer getCustomer(String customerEmail) {
        return customerService.getCustomer(customerEmail);
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    public void addRoom(Room rooms) {
        reservationService.addRoom(rooms);
    }


    public Reservation reserveRoom(Customer customer, Room room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveRoom(customer, room, checkInDate, checkOutDate);
    }


    public List<Reservation> getCustomerReservation(Customer customer) {
        return reservationService.getCustomerReservation(customer);
    }

    public void displayAllReservations() {
        reservationService.printAllReservations();
    }

    public List<Reservation> getCustomerReservations(String customerEmail) {
        return reservationService.getCustomerReservations(customerEmail);
    }

    public List<IRoom> allRooms() {
        return reservationService.allRooms();
    }

    public Collection<IRoom> findARoom(Date checkInDate, Date checkOutDate) {
        return null;
    }
}
