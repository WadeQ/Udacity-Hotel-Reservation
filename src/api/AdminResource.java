package api;

import model.Customer;
import model.IRoom;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.List;

/**
 * Created by Wadek on 26/10/2020.
 */
public class AdminResource implements CustomerService {

    public void displayAllReservations(){
    }

    public Collection<IRoom> getAllRooms(){
        return null;
    }

    @Override
    public void addCustomer(String email, String firstName, String lastName) {
    }

    @Override
    public Customer getCustomer(String customerEmail) {
        return null;
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return null;
    }

    public static void addRoom(List<IRoom> rooms) {
    }
}
