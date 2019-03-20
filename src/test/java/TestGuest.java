import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    DiningRoom diningRoom3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    GamesRoom gamesRoom1;
    GamesRoom gamesRoom2;
    GamesRoom gamesRoom3;

  @Before
  public void setup(){
      guest1 = new Guest("Heather");
      guest2 = new Guest("Angus");
      guest3 = new Guest("Monty");
      guest4 = new Guest("Bella");
      diningRoom1 = new DiningRoom(12, "Mexican");
      diningRoom2 = new DiningRoom(24, "Asian");
      diningRoom3 = new DiningRoom(10, "Greek");
      bedroom1 = new Bedroom("4", 2, "Double");
      bedroom2 = new Bedroom("5", 4, "Pent House");
      bedroom3 = new Bedroom("6", 1, "Single");
      gamesRoom1 = new GamesRoom(6, "Play Station");
      gamesRoom2 = new GamesRoom(4, "Chess");
      gamesRoom3 = new GamesRoom(10, "Yoga");
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

    @Test
    public void canCheckInToRoom(){
        guest1.checkIn(bedroom1);
      assertEquals(1, bedroom1.getCapacity());
    }
}
