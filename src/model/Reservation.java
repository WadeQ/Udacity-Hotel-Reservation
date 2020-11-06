package model;

import java.util.Date;

/**
 * Created by Wadek on 25/10/2020.
 */
public class Reservation {
    private Customer customer;
    private IRoom Iroom;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom iroom, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        Iroom = iroom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", Iroom=" + Iroom +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public IRoom getIroom() {
        return Iroom;
    }

    public void setIroom(IRoom iroom) {
        Iroom = iroom;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

}
