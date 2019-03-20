import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGamesRoom {

    GamesRoom gamesRoom1;
    GamesRoom gamesRoom2;
    GamesRoom gamesRoom3;

    @Before
    public void setup(){
        gamesRoom1 = new GamesRoom(6, "Play Station");
        gamesRoom2 = new GamesRoom(4, "Chess");
        gamesRoom3 = new GamesRoom(10, "Yoga");
    }

    @Test
    public void canGetName() {
        assertEquals("Play Station", gamesRoom1.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, gamesRoom2.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        gamesRoom1.setCapacity(10);
        assertEquals(10, gamesRoom1.getCapacity());
    }

    @Test
    public void canSetName() {
        gamesRoom1.setName("Pool");
        assertEquals("Pool", gamesRoom1.getName());
    }
}
