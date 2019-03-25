import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    GamesRoom gamesRoom1;
    GamesRoom gamesRoom2;
    GamesRoom gamesRoom3;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    DiningRoom diningRoom3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<GamesRoom> gamesRooms;
    ArrayList<Guest> guests;


    @Before
    public void setup(){
        hotel = new Hotel("Hotel Awesome");
        guest1 = new Guest("Heather");
        guest2 = new Guest("Angus");
        guest3 = new Guest("Monty");
        guest4 = new Guest("Bella");
        gamesRoom1 = new GamesRoom(6, "Play Station");
        gamesRoom2 = new GamesRoom(4, "Chess");
        gamesRoom3 = new GamesRoom(10, "Yoga");
        diningRoom1 = new DiningRoom(12, "Mexican");
        diningRoom2 = new DiningRoom(24, "Asian");
        diningRoom3 = new DiningRoom(10, "Greek");
        bedroom1 = new Bedroom(2, 4, "Double");
        bedroom2 = new Bedroom(4, 5, "Pent House");
        bedroom3 = new Bedroom(1, 6, "Single");
        bedrooms = new ArrayList<Bedroom>();
        hotel.setBedRooms(bedrooms);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        diningRooms = new ArrayList<DiningRoom>();
        hotel.setDiningRooms(diningRooms);
        diningRooms.add(diningRoom1);
        diningRooms.add(diningRoom2);
        diningRooms.add(diningRoom3);
        gamesRooms = new ArrayList<GamesRoom>();
        hotel.setGamesRooms(gamesRooms);
        gamesRooms.add(gamesRoom1);
        gamesRooms.add(gamesRoom2);
        gamesRooms.add(gamesRoom3);
    }

    @Test
    public void hasName(){
        assertEquals("Hotel Awesome", hotel.getName());
    }

    @Test
    public void canSetName(){
        hotel.setName("Hotel Fab");
        assertEquals("Hotel Fab", hotel.getName());
    }

    @Test
    public void canFindBedroom(){
        assertEquals(bedroom1, hotel.findBedroom(4));
    }

//    @Test
//    public void canSetBedrooms(){
//
//    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestsToBedroom(4, guest1);
        hotel.checkInGuestsToBedroom(4, guest2);
        hotel.checkInGuestsToBedroom(4, guest3);
        assertEquals(2, bedroom1.countGuests());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.checkInGuestsToBedroom(4, guest1);
        hotel.checkOutGuestFromBedroom(4, guest1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canCheckInGuestToDiningRoom(){
        hotel.checkInGuestsToDiningRoom("Mexican", guest2);
        assertEquals(1, diningRoom1.countGuests());
    }

    @Test public void canCheckOutGuestFromDiningRoom(){
        hotel.checkInGuestsToDiningRoom("Mexican", guest1);
        hotel.checkOutGuestFromDiningRoom("Mexican", guest1);
        assertEquals(0, diningRoom1.countGuests());
    }

    @Test public void canCheckInGuestToGamesRoom(){
        hotel.checkInGuestsToGamesRoom("Play Station", guest1);
        assertEquals(1,gamesRoom1.countGuests());
    }

    @Test public void canCheckOutGuestFromGamesRoom(){
        hotel.checkInGuestsToGamesRoom("Play Station", guest1);
        hotel.checkOutGuestFromGamesRoom("Play Station", guest1);
        assertEquals(0, gamesRoom1.countGuests());
    }
}
