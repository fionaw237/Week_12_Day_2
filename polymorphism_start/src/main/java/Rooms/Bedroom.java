package Rooms;

public class Bedroom extends Room implements Bookable{
    private int number;
    private String type;
    private double pricePerNight;


    public Bedroom(int number, String type, int capacity, double pricePerNight) {
        super(capacity);
        this.type = type;
        this.number = number;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }


    public double getPricePerNight() {
        return this.pricePerNight;
    }

    public Booking bookRoom(){
        return new Booking();
    }


}
