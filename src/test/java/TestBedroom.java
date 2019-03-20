import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void setup(){
        bedroom1 = new Bedroom("4", 2, "Double");
        bedroom2 = new Bedroom("5", 4, "Pent House");
        bedroom3 = new Bedroom("6", 1, "Single");
        guest1 = new Guest("Heather");
        guest2 = new Guest("Angus");
        guest3 = new Guest("Monty");
        guest4 = new Guest("Bella");
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom1.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom2.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals("6", bedroom3.getRoomNumber());
    }

    @Test
    public void canSetRoomNumber(){
        bedroom1.setRoomNumber("5");
        assertEquals("5", bedroom1.getRoomNumber());
    }

    @Test
    public void canSetCapacity(){
        bedroom1.setCapacity(3);
        assertEquals(3, bedroom1.getCapacity());
    }

    @Test
    public void canSetType(){
        bedroom2.setType("Master");
        assertEquals("Master", bedroom2.getType());
    }

    @Test
    public void canCountGuests(){
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canAddGuest(){
        bedroom2.addGuest(guest1);
        assertEquals(1, bedroom2.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom2.addGuest(guest1);
        bedroom2.removeGuest(guest1);
        assertEquals(0, bedroom2.countGuests());
    }


}
