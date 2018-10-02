import Guests.Guest;
import Rooms.*;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }


    public int diningRoomCount() {
        return this.diningRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom room) {
        this.diningRooms.add(room);
    }

    public void addConferenceRoom(ConferenceRoom room) {
        this.conferenceRooms.add(room);
    }

    public void checkIn(Room room, ArrayList<Guest> guests){
        for (Guest guest : guests){
            room.checkIn(guest);
        }
    }

    public void checkOut(Room room){
        room.checkOut();
    }

    public Booking bookRoom(Bookable room){
        return room.bookRoom();
    }



}
