package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Chapter7.SchoolAdmin.*;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolAdminTest {
    SchoolAdmin admin;

    @BeforeEach
    public void set(){
        int[][] scores = new int[2][5];
        admin = new SchoolAdmin(scores);
    }
    @Test
//    public void getScores(){
//        SchoolAdminTest admin = null;
//
//        for (int counter = 0; counter < admin.getScores().lenght)
    public void calculateAverageScores(){
        admin.calculateAverageScores();
        assertEquals(78, 68);
    }
}
