package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthRecordTest {
    HealthRecord healthRecord;

       // private tdd.HealthRecord;
        @BeforeEach
        void startAllTestWith(){
            healthRecord = new HealthRecord();

        }

        @Test
        void getFirstName () {
                assertNotNull(healthRecord);

        }

        @Test
        void setMonthOfBirth () {
                assertEquals(12, 100);
        }

        @Test
        void getMonthOfBirth () {
        assertEquals(1, 12);
        }

        @Test
        void setDayOfBirth () {
            assertEquals(1, 31);
        }

        @Test
        void getDayOfBirth () {
            assertEquals(1, 30);
        }

        @Test
        void setYearOfBirth () {
            assertEquals(1000, 3000);
        }

        @Test
        void getYearOfBirth () {
            assertEquals(1000, 3000);
        }

        @Test
        void setHeight () {
            assertEquals(3f, 8f);
        }

        @Test
        void getHeight () {
            assertEquals(5,6);
        }

        @Test
        void setWeight () {
            int kg;
            assertEquals(5, 6);
        }
    }
