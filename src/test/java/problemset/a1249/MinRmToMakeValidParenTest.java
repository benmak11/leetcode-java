package problemset.a1249;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRmToMakeValidParenTest {

    private MinRmToMakeValidParen paren;

    private String testcaseOne = "lee(t(c)o)de)";
    private String testcaseTwo = "a)b(c)d";
    private String testcaseThree = "))((";

    @BeforeEach
    void setUp() {
        paren = new MinRmToMakeValidParen();
    }

    @Test
    void test_minRemoveToMakeValid() {
        String expectedResult = "lee(t(c)o)de";
        String actualResult = paren.minRemoveToMakeValid(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_minRemoveToMakeValid_v2() {
        String expectedResult = "ab(c)d";
        String actualResult = paren.minRemoveToMakeValid(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_minRemoveToMakeValid_v3() {
        String expectedResult = "";
        String actualResult = paren.minRemoveToMakeValid(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}