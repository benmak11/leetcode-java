package problemset.a0880;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringAtIndexTest {
    private DecodeStringAtIndex decode = new DecodeStringAtIndex();

    @Test
    void test_decodeAtIndex_1() {
        String expectedResult = "o";
        String actualResult = decode.decodeAtIndex("leet2code3", 10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_decodeAtIndex_2() {
        String expectedResult = "h";
        String actualResult = decode.decodeAtIndex("ha22", 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_decodeAtIndex_3() {
        String expectedResult = "a";
        String actualResult = decode.decodeAtIndex("a2345678999999999999999", 1);
        assertEquals(expectedResult, actualResult);
    }
}