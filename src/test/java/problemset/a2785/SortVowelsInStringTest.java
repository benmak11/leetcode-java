package problemset.a2785;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortVowelsInStringTest {

    private SortVowelsInString vowels;

    private String inputTestCaseOne;
    private String expectedTestCaseOne;
    private String inputTestCaseTwo;
    private String expectedTestCaseTwo;

    @BeforeEach
    void setUp() {
        vowels = new SortVowelsInString();

        inputTestCaseOne = "lEetcOde";
        expectedTestCaseOne = "lEOtcede";
        inputTestCaseTwo = "lYmpH";
        expectedTestCaseTwo = "lYmpH";
    }

    @Test
    void testCaseOne_sortVowels() {
        assertEquals(expectedTestCaseOne, vowels.sortVowels(inputTestCaseOne));
    }

    @Test
    void testCaseTwo_sortVowels() {
        assertEquals(expectedTestCaseTwo, vowels.sortVowels(inputTestCaseTwo));
    }
}
