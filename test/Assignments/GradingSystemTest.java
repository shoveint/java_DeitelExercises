package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingSystemTest {
    GradingSystem gradingSystem = new GradingSystem();


    @Test
    void setSchoolName() {
        //given
        //when
        gradingSystem.setSchoolName("justin_inter_school");
        // assert
        assertEquals("justin_inter_school", gradingSystem.getSchoolName());

    }

    @Test
    void getSchoolName() {
        //given
        gradingSystem.setSchoolName("justin_inter_school");
        String result = gradingSystem.getSchoolName();
        assertEquals("justin_inter_school", result);
        //when
        gradingSystem.setSchoolName("Shola_inter_school");
        //assert
        assertEquals("Shola_inter_school", gradingSystem.getSchoolName());

    }

    @Test
    void setPosition() {
        gradingSystem.setPosition(100);
        String grade = gradingSystem.getPosition();
        assertEquals("A", grade);
    }
}