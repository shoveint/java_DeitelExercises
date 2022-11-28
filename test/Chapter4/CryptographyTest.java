package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CryptographyTest {
    @BeforeEach
    public void setUp(){}


    @Test
    public void encrypt(){
        int encryptedCode = Cryptography.encrypt(4132);
        assertEquals("2981" , encryptedCode);
    }

    @Test
    public void decrypted(){
        //String code = new String("0918");
        int encryptedCode = Cryptography.encrypt(2981);
        assertEquals("1452" , encryptedCode);
    }
}
