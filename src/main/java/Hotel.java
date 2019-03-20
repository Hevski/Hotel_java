import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<GamesRoom> gamesRooms;


    public Hotel(String name) {
        this.name = name;
        this.bedRooms = new ArrayList<Bedroom>();
        this.diningRooms = new ArrayList<DiningRoom>();
        this.gamesRooms = new ArrayList<GamesRoom>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBedRooms(ArrayList<Bedroom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public void setDiningRooms(ArrayList<DiningRoom> diningRooms) {
        this.diningRooms = diningRooms;
    }

    public void setGamesRooms(ArrayList<GamesRoom> gamesRooms) {
        this.gamesRooms = gamesRooms;
    }

    public Bedroom findBedroom(String roomnumber) {
        Bedroom foundBedroom = null;
        for (Bedroom bedroom : this.bedRooms) {
            if (bedroom.getRoomNumber().equals(roomnumber)) {
                foundBedroom = bedroom;
            }
        }
        return foundBedroom;
    }

     public void checkInGuestsToBedroom(String roomNumber, Guest guest) {
        Bedroom foundBedroom = findBedroom(roomNumber);
        foundBedroom.checkInGuest(guest);
     }


    public void checkOutGuestFromBedroom(String roomNumber, Guest guest) {
        Bedroom foundBedroom = findBedroom(roomNumber);
        foundBedroom.checkOutGuest(guest);
    }

    public void checkInGuestsToDiningRoom(String name, Guest guest){
        for (DiningRoom diningRoom : this.diningRooms){
            if (diningRoom.getName().equals(name)) {
                diningRoom.checkInGuest(guest);
            }
        }
    }

    public void checkOutGuestFromDiningRoom(String name, Guest guest) {
        for (DiningRoom diningRoom : this.diningRooms){
            if (diningRoom.getName().equals(name)) {
                diningRoom.checkOutGuest(guest);
            }
        }
    }

    public void checkInGuestsToGamesRoom(String name, Guest guest) {
        for (GamesRoom gamesRoom : this.gamesRooms){
            if (gamesRoom.getName().equals(name)) {
                gamesRoom.checkInGuest(guest);
            }
        }
    }

    public void checkOutGuestFromGamesRoom(String name, Guest guest) {
        for (GamesRoom gamesRoom : this.gamesRooms){
            if (gamesRoom.getName().equals(name)) {
                gamesRoom.checkOutGuest(guest);
            }
        }
    }
}
