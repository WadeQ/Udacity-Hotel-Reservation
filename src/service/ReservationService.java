package service;

import model.Customer;
import model.FreeRoom;
import model.IRoom;
import model.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Wadek on 25/10/2020.
 */
public class ReservationService {
    private static final ArrayList<IRoom> rooms = new ArrayList<>();
    private static final ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRoom(IRoom room) {
        rooms.add(room);
    }

    public IRoom getARoom(String roomId) {
        for (IRoom room : rooms) {
            if (room.getRoomNumber().equals(roomId)) {
                return room;
            }
        }
        return null;
    }

    public Reservation reserveRoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        return reservation;
    }

    public List<IRoom> findARoom(Date checkInDate, Date checkOutDate) {
        List<IRoom> roomsAccordingToDates = new ArrayList<>();
        try {
            for (Reservation reservation : reservations) {
                if (reservation.getCheckInDate() == checkInDate &&
                        reservation.getCheckOutDate() == checkOutDate) {
                    roomsAccordingToDates.add(reservation.getIroom());
                }
            }
        } catch (Exception e){
            if (reservations.isEmpty()) return null;
        }
        return roomsAccordingToDates;
    }

    public List<Reservation> getCustomerReservation(Customer customer) {
        List<Reservation> reservationsAccordingToCustomer = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getCustomer().equals(customer)) {
                reservationsAccordingToCustomer.add(reservation);
            }
        }
        return reservationsAccordingToCustomer;
    }

    public void printAllReservations() {
        System.out.println(reservations);
    }

    public List<Reservation> getCustomerReservations(String customerEmail) {
        List<Reservation> reservationsAccordingToCustomerEmail = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getCustomer().getEmail().equals(customerEmail)) {
                reservationsAccordingToCustomerEmail.add(reservation);
            }
        }
        return reservationsAccordingToCustomerEmail;
    }

    public List<IRoom> allRooms() {
        return rooms;
    }

    static class FindRoom {
        Date checkInDate;
        Date checkOutDate;

        List<FreeRoom> openRooms = new ArrayList<>();
        List<FreeRoom> recommendedRooms = new ArrayList<>();

        public List<FreeRoom> getOpenRooms() {
            for (FreeRoom freeRoom : openRooms) {
                System.out.println(freeRoom);
            }
            return openRooms;
        }

        public List<FreeRoom> getRecommendedRooms() {
            for (FreeRoom freeRoom : recommendedRooms) {
                System.out.println(freeRoom);
            }
            return recommendedRooms;
        }
    }
}
