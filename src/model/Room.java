package model;

/**
 * Created by Wadek on 25/10/2020.
 */
public class Room implements IRoom {
    public String roomNumber ;
    public Double price;
    public RoomType roomType;

    @Override
    public String toString() {
        return "model.Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                '}';
    }


    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
