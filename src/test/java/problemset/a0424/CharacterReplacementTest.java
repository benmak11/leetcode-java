package problemset.a0424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterReplacementTest {

    private CharacterReplacement charReplace;

    private String testcaseOne;
    private String testcaseTwo;

    @BeforeEach
    void setUp() {
        charReplace = new CharacterReplacement();
        testcaseOne = "ABAB";
        testcaseTwo = "AABABBA";
    }

    @Test
    void test_characterReplacement() {
        int expectedResult = 4;
        int actualResult = charReplace.characterReplacement(testcaseOne, 2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_characterReplacement_V2() {
        int expectedResult = 4;
        int actualResult = charReplace.characterReplacement(testcaseTwo, 1);
        assertEquals(expectedResult, actualResult);
    }
}