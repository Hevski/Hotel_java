import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

  @Before
  public void setup(){
      guest1 = new Guest("Heather");
      guest2 = new Guest("Angus");
      guest3 = new Guest("Monty");
      guest4 = new Guest("Bella");
  }

    @Test
    public void hasName() {
      assertEquals("Heather", guest1.getName());
    }

    @Test
    public void canSetName () {
      guest1.setName("Bob");
      assertEquals("Bob", guest1.getName());
    }

//    @Test
//    public void canCheckInToRoom(){
//        guest1.checkIn(bedroom1);
//      assertEquals(1, bedroom1.getCapacity());
//    }
}
