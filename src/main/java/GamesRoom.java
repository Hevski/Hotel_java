public class GamesRoom extends Room {

    private String name;

    public GamesRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
