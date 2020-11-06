package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import service.CustomerService;
import service.ReservationService;

import java.util.Date;
import java.util.List;

/**
 * Created by Wadek on 25/10/2020.
 */
public class HotelResource {
    private static final CustomerService customerService = new CustomerService();
    private static final ReservationService reservationService = new ReservationService();

    public void createACustomer(String email, String firstName, String lastName) {
        customerService.addCustomer(email, firstName, lastName);
    }

    public Customer getCustomer(String customerEmail) {
        return customerService.getCustomer(customerEmail);
    }

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void addRoom(Room room) {
        reservationService.addRoom(room);
    }

    public IRoom getRoom(String roomNumber) {
        return reservationService.getARoom(roomNumber);
    }

    public Reservation bookARoom(Customer customer, Room room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveRoom(customer, room, checkInDate, checkOutDate);
    }

    public List<IRoom> findARoom(Date checkInDate, Date checkOutDate) {
        return reservationService.findARoom(checkInDate, checkOutDate);
    }

    public void printAllReservations() {
        reservationService.printAllReservations();
    }

    public List<Reservation> getCustomerReservations(String customerEmail) {
        return reservationService.getCustomerReservations(customerEmail);
    }
}
