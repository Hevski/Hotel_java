import java.util.ArrayList;

public class GamesRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public GamesRoom (int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public ArrayList<Guest> getGuests() {
//        return guests;
//    }
//
//    public void setGuests(ArrayList<Guest> guests) {
//        this.guests = guests;
//    }
}
