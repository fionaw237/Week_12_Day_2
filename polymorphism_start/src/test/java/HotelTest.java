import Guests.Guest;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {
    Hotel hotel;
    Bedroom singleRoom;
    Bedroom doubleRoom;

    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        singleRoom = new Bedroom(101, "Single", 1, 25.00);
        doubleRoom = new Bedroom(102, "Double", 2, 50.00);

        conferenceRoom = new ConferenceRoom("Charles Babbage Suite", 2, 1000.00);
        diningRoom = new DiningRoom("Canteen", 2);

        guest1 = new Guest("Ada Lovelace");
        guest2 = new Guest("Alan Turing");
        guest3 = new Guest("Clive Sinclair");
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void bedRoomCountStartsAtZero() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(singleRoom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canSetDiningRoom() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void canCheckGuestsIntoConferenceRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkIn(conferenceRoom, guestList);
        assertEquals(2, conferenceRoom.numberOfGuests());
    }

    @Test
    public void cannotCheckTooManyGuestsIntoConferenceRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.checkIn(conferenceRoom, guestList);
        assertEquals(2, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestsIntoDiningRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        hotel.addDiningRoom(diningRoom);
        hotel.checkIn(diningRoom, guestList);
        assertEquals(2, diningRoom.numberOfGuests());
    }

    @Test
    public void cannotCheckTooManyGuestsIntoDiningRoom() {
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        hotel.addDiningRoom(diningRoom);
        hotel.checkIn(diningRoom, guestList);
        assertEquals(2, diningRoom.numberOfGuests());
    }



    @Test
    public void canCheckGuestIntoBedroom() {
        hotel.addBedroom(singleRoom);
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        hotel.checkIn(singleRoom, guestList);
        assertEquals(1, singleRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel.addBedroom(singleRoom);
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        hotel.checkIn(singleRoom, guestList);
        hotel.checkOut(singleRoom);
        assertEquals(0, singleRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfDiningroom() {
        hotel.addDiningRoom(diningRoom);
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        hotel.checkIn(diningRoom, guestList);
        hotel.checkOut(diningRoom);
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfConferenceroom() {
        hotel.addConferenceRoom(conferenceRoom);
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        hotel.checkIn(conferenceRoom, guestList);
        hotel.checkOut(conferenceRoom);
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canBookBedroom(){
        hotel.addBedroom(singleRoom);
        Booking booking = hotel.bookRoom(singleRoom);
        assertNotNull(booking);
    }

    @Test
    public void canBookConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        Booking booking = hotel.bookRoom(conferenceRoom);
        assertNotNull(booking);
    }

    public void canGetBedroomFromList(){
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(singleRoom);
        rooms.add(conferenceRoom);
        rooms.add(diningRoom);

        Bedroom foundRoom = null;
        for (Room room : rooms)
        if (room instanceof Bedroom){
            foundRoom = (Bedroom) room;
        }
        assertEquals(101, foundRoom.getNumber());
    }
}
