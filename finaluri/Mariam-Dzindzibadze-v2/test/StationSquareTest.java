import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    @Test
    public void haveTicketTest(){
        Passenger mariam = new Passenger("Mariam", true);
        Train train = new Train();
        train.addPassenger(mariam);
        assertEquals(true, train.getPassengerList().contains(mariam));
    }

    @Test
    public void haveNoTicketTest(){
        Passenger mariam = new Passenger("Mariam", false);
        Train train = new Train();
        train.addPassenger(mariam);
        assertEquals(false, train.getPassengerList().contains(mariam));
    }
}
