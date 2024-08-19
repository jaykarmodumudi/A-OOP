package customersupportticketsys;

public class Ticket {
    private static int idCounter = 0;
    private int id;
    private String description;

    public Ticket(String description) {
        this.id = ++idCounter;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Description: " + description;
    }
}
