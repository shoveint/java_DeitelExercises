import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WhileCounterTest {

    @Test
   public void main(String[] args) {
        int counter = 1;

        do {
            System.out.printf("%d ", counter);
            counter++;
        }
        while (counter <= 10);
        System.out.println();
    }
}