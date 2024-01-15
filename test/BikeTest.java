import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    void testInstantiateBike() {
        Bike bike = new Bike("testbike");

        assertEquals(bike.getName(), "testbike");
    }

    @Test
    void testBikePrice() {
        Bike bike = new Bike("testbike", 200);
        assertEquals(200, bike.getPrice());
    }
}