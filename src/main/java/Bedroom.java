import java.util.ArrayList;

public class Bedroom {

    private String roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom (String roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public ArrayList<Guest> getGuests() {
//        return guests;
//    }
//
//    public void setGuests(ArrayList<Guest> guests) {
//        this.guests = guests;
//    }
}
