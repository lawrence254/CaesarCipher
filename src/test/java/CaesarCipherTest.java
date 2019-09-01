import static org.junit.Assert.*;

import org.junit.*;

public class CaesarCipherTest {
    //if the text is a String
    @Test
    public void text_textIsString(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getText() instanceof String);
    }
    //if the key input is an integer
    @Test
    public void key_keyIsInteger(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getKey() instanceof Integer);
    }
    //accurate single letters
    @Test
    public void encode_encodeASingleLetterWithShiftWithinBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals("b", testCaesarCipher.encode());
    }

    //
  /*  @Test
    public void encode_encodeASingleLetterWithShiftOutOfBounds_a(){
        CaesarCipher testCaesarCipher = new CaesarCipher("z",1);
        assertEquals("a", testCaesarCipher.encode());
    }

    @Test
    public void encode_encodeASingleLetterWithAWithinBoundsNegativeShift_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",-25);
        assertEquals("b", testCaesarCipher.encode());
    }

    @Test
    public void encode_encodesUpperCaseToUpperCaseAndLowerCaseToLowerCase_B(){
        CaesarCipher testCaesarCipher = new CaesarCipher("A",-25);
        assertEquals("B", testCaesarCipher.encode());
    }

    @Test
    public void encode_doesNotEncodeSymbolsAndPeriods_Space(){
        CaesarCipher testCaesarCipher = new CaesarCipher(" ",-25);
        assertEquals(" ", testCaesarCipher.encode());
    }

    @Test
    public void encode_multiCharacterString_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Frank a",1);
        assertEquals("Gsbol b", testCaesarCipher.encode());
    }
*/



}