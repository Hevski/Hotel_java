public class Bedroom extends Room {

    private int roomNumber;
    private String type;

    public Bedroom(int capacity, int roomNumber, String type) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
