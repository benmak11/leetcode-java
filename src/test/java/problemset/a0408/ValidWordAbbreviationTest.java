package problemset.a0408;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidWordAbbreviationTest {

    private ValidWordAbbreviation word = new ValidWordAbbreviation();

    private String strTestCaseOne = "internationalization", strAbbrTestCaseOne = "i12iz4n";
    private String strTestCaseTwo = "apple", strAbbrTestCaseTwo = "a2e";

    @Test
    void test_validWordAbbr_one() {
        boolean actualResult = word.validWordAbbreviation(strTestCaseOne, strAbbrTestCaseOne);
        assertTrue(actualResult);
    }

    @Test
    void test_validWordAbbr_two() {
        boolean actualResult = word.validWordAbbreviation(strTestCaseTwo, strAbbrTestCaseTwo);
        assertFalse(actualResult);
    }
}