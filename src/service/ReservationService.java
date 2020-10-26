package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Wadek on 25/10/2020.
 */
public interface ReservationService {

    static void addRoom(IRoom room) { }

    IRoom getARoom(String roomId);

    static Reservation reserveRoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return null;
    }

    Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate);

    static Collection<Reservation> getCustomerReservation(Customer customer) { return null; }

    static void printAllReservations() { }

    Collection<Reservation> getCustomerReservations(String customerEmail) ;
}
