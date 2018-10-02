package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int numberOfGuests(){
        return this.guests.size();
    }

    public boolean isFull() {
        return this.guests.size() == this.capacity;
    }

    public void checkIn(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    protected ArrayList<Guest> getGuests(){
        return this.guests;
    }

    public void checkOut(){
        this.guests.clear();
    }

}
