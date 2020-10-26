package model;

/**
 * Created by Wadek on 25/10/2020.
 */
public class FreeRoom extends Room {
    public FreeRoom() {
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return "model.FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                '}';
    }
}
