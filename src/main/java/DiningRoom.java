import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom (int capacity, String name) {
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

    public void addGuest(Guest guest){
        if (this.capacity > countGuests()) {
            this.guests.add(guest);
        }
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

}
