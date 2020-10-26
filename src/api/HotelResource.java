package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Wadek on 25/10/2020.
 */
public class HotelResource implements CustomerService, ReservationService {

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

    @Override
    public IRoom getARoom(String roomId) {
        return null;
    }

    static public Reservation reserveRoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public Collection<Reservation> getCustomerReservations(String customerEmail) {
        return null;
    }
}
