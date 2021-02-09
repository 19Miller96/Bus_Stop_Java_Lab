import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> seats;

    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.seats = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int checkNumberOnboard() {
        return this.seats.size();
    }

    public void addPassengers(Person person) {
        if (this.checkNumberOnboard() < this.capacity) {
            this.seats.add(person);
        }
    }

    public void removePassengers(Person person) {
        this.seats.remove(person);
    }

}
