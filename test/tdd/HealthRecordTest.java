package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthRecordTest {
    public static void main(String[] args) {

    }
    HealthRecord healthRecord;

       // private tdd.HealthRecord;
        @BeforeEach
        void startAllTestWith(){
            String lastName = assertNotNull(healthRecord);
            healthRecord = new HealthRecord(lastName);

        }

    private String assertNotNull(HealthRecord healthRecord) {
            return healthRecord.getLastName();
    }

    @Test
        void getFirstName () {
                assertNotNull(healthRecord);

        }

        @Test
        void setMonthOfBirth () {
                assertEquals((short) 12);
        }

        @Test
        void getMonthOfBirth () {
        assertEquals((short) 12);
        }

        @Test
        void setDayOfBirth () {
            assertEquals((short) 31);
        }

        @Test
        void getDayOfBirth () {
            assertEquals((short) 30);
        }

        @Test
        void setYearOfBirth () {
            assertEquals((short) 2000);
        }

        @Test
        void getYearOfBirth () {
            assertEquals((short) 2000);
        }

        @Test
        void setHeight () {
            assertEquals((short) 5f);
        }

        @Test
        void getHeight () {
            assertEquals((short) 5f);
        }

        @Test
        void setWeight () {
            int kg;
            assertEquals((short) 56);
        }

    @Test
    void setFistName() {
        short Fagbohun = 0;
        assertEquals(Fagbohun);
    }

    private void assertEquals(short fagbohun) {
    }
    @Test
    void setGender() {
    }

    @Test
    void getGender() {
    }



    @Test
    void testGetHeight() {
    }

    @Test
    void testSetWeight() {
    }

    @Test
    void getWeight() {
    }

    @Test
    void testSetWeight1() {
    }

    @Test
    void getLastName() {
    }
}
