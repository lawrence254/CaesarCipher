import static org.junit.Assert.*;

import org.junit.*;

public class CaesarCipherTest {

    @Test
    public void text_textIsString() {
        CaesarCipher testCaesarCipher = new CaesarCipher("a", 1);
        assertEquals(true, testCaesarCipher.getText() instanceof String);
    }


    //if the key input is an integer

   @Test
    public void key_keyIsInteger(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals(true, testCaesarCipher.getKey() instanceof Integer);
    }

    @Test
    public void encode_encodeASingleLetterWithShiftWithinBounds_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",1);
        assertEquals("b", testCaesarCipher.encode());
    }
    //if input still gives a shift out of bond
    @Test
    public void encode_encodeASingleLetterWithShiftOutOfBounds_a(){
        CaesarCipher testCaesarCipher = new CaesarCipher("z",1);
        assertEquals("a", testCaesarCipher.encode());
    }

    //if input key -25 will result to be
    @Test
    public void encode_encodeASingleLetterWithAWithinBoundsNegativeShift_b(){
        CaesarCipher testCaesarCipher = new CaesarCipher("a",-25);
        assertEquals("b", testCaesarCipher.encode());
    }
//uppercase and lowercase
   @Test
    public void encode_encodesUpperCaseToUpperCaseAndLowerCaseToLowerCase_B(){
        CaesarCipher testCaesarCipher = new CaesarCipher("t",-25);
        assertEquals("u", testCaesarCipher.encode());
    }
//test Encoding with Symbols and spaces .
   @Test
    public void encode_doesNotEncodeSymbolsAndPeriods_Space(){
        CaesarCipher testCaesarCipher = new CaesarCipher(" ",-25);
        assertEquals(" ", testCaesarCipher.encode());
    }
//test for multiCharacter
    @Test
    public void encode_multiCharacterString_String(){
        CaesarCipher testCaesarCipher = new CaesarCipher("abcD a",3);
        assertEquals("defG d", testCaesarCipher.encode());
    }

    @Test
    public void decode_decodeASingleLetterWithShiftWithinBounds_a(){
    CaesarCipher testCaesarCipher = new CaesarCipher("b",1);
    assertEquals("a", testCaesarCipher.decode());
}
}