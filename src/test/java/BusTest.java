import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Mile-End", 3);
        person = new Person("Ali");
    }

    @Test
    public void hasDestination() {
        assertEquals("Mile-End", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void passengersOnboard() {
//        bus.getPassengersOnboard();
        assertEquals(0, bus.checkNumberOnboard());
    }

    @Test
    public void addPassengers(){
        bus.addPassengers(person);
        assertEquals(1, bus.checkNumberOnboard());
    }

    @Test
    public void ifSeatAvailable() {
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        assertEquals(3, bus.checkNumberOnboard());
    }

    @Test
    public void canRemovePassengers() {
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.removePassengers(person);
        assertEquals(1, bus.checkNumberOnboard());
    }

}

// check we have a destination

// check we have a capacity

// check we have a empty arraylist

