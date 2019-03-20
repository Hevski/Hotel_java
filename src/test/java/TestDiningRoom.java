import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    DiningRoom diningRoom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void setup(){
        diningRoom1 = new DiningRoom(12, "Mexican");
        diningRoom2 = new DiningRoom(24, "Asian");
        diningRoom3 = new DiningRoom(10, "Greek");
        guest1 = new Guest("Heather");
        guest2 = new Guest("Angus");
        guest3 = new Guest("Monty");
        guest4 = new Guest("Bella");
    }

    @Test
    public void hasName() {
        assertEquals("Mexican", diningRoom1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(12, diningRoom1.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        diningRoom1.setCapacity(24);
        assertEquals(24, diningRoom1.getCapacity());
    }

    @Test
    public void canSetName() {
        diningRoom2.setName("Scottish");
        assertEquals("Scottish", diningRoom2.getName());
    }

    @Test
    public void canCountGuests(){
        assertEquals(0, diningRoom2.countGuests());
    }

    @Test
    public void canAddGuest(){
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom1.addGuest(guest1);
        diningRoom1.removeGuest(guest1);
        assertEquals(0, diningRoom1.countGuests());
    }

}
