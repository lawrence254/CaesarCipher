import static org.junit.Assert.*;

import org.junit.*;

public class CaesarCipherTest {
    @Test
    public void text_textIsString(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getText() instanceof String);
    }
    @Test
    public void key_keyIsInteger(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getKey() instanceof Integer);
    }
    /*@Test
    public void encode_encodeASingleLetterWithShiftWithinBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals("b", testCaesarCipher.encode());
    }*/

}