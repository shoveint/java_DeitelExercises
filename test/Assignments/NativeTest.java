package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    @Test
    public void nativeConstructorTest() {
        Human human = new Human();
        human.setEmailAddress("person_email@email.com");
        human.setFirstName("Shola");
        human.setLastName("Justin");
        human.setPhoneNumber("07033045103");

        Native love = new Native(human);
        Native tolulope = new Native(human);
        assertEquals("Shola", love.getFirstName());
        assertEquals("person_email@email.com", love.getEmailAddress());
        assertEquals("Justin", tolulope.getLastName());
    }


    @Test
    public void oddElementsTest() {
        int[] array = {4, 5, 6, 8, 7, 18, 6, 9, 3, 11};



    }
}