import static org.junit.Assert.*;

import org.junit.*;

public class CaesarCipherTest {
    @Test
    public void text_textIsString(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getText() instanceof String);
    }

}