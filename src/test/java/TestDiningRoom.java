import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    DiningRoom diningRoom3;

    @Before
    public void setup(){
        diningRoom1 = new DiningRoom(12, "Mexican");
        diningRoom2 = new DiningRoom(24, "Asian");
        diningRoom3 = new DiningRoom(10, "Greek");
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

}
