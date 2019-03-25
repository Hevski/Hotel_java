import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void checkInGuest(Guest guest){
        if (this.capacity > countGuests()) {
            this.guests.add(guest);
        }
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
