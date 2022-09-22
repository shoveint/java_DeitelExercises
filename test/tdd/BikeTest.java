package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void setBikeOn() {
        int acceleration = 2;
        Bike bike = new Bike();
        bike.setBikeOn();
        boolean bikeOn = bike.getBikeOn();
        assertTrue(bikeOn);
    }

    @Test
    public void getBikeOn() {
        boolean bikeOn = true;
        Bike bike = new Bike();
        bike.setBikeOff();
        boolean bikeOff = bike.getBikeOff();
        assertFalse(bikeOff);
    }

    @Test
    void setAcceleration() {
        int acceleration = 2;
        Bike bike = new Bike();
        bike.setAcceleration();
    }

}