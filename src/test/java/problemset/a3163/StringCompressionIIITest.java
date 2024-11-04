package problemset.a3163;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionIIITest {

    private StringCompressionIII str;
    String wordTest1;
    String wordTest2;
    String wordTest3;

    @BeforeEach
    void setUp() {
        str = new StringCompressionIII();
        wordTest1 = "abcde";
        wordTest2 = "aaaaaaaaaaaaaabb";
        wordTest3 = "au";
    }

    @Test
    void test_compressString1() {
        String result = str.compressString(wordTest1);
        String expectedResult = "1a1b1c1d1e";
        assertEquals(expectedResult, result);
    }

    @Test
    void test_compressString2() {
        String result = str.compressString(wordTest2);
        String expectedResult = "9a5a2b";
        assertEquals(expectedResult, result);
    }

    @Test
    void test_compressString3() {
        String result = str.compressString(wordTest3);
        String expectedResult = "1a1u";
        assertEquals(expectedResult, result);
    }
}