package problemset.a0125;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private ValidPalindrome valid;

    private String testcaseOne;
    private String testcaseTwo;
    private String testcaseThree;

    @BeforeEach
    void setUp() {
        valid = new ValidPalindrome();
        testcaseOne = "A man, a plan, a canal: Panama";
        testcaseTwo = "race a car";
        testcaseThree = " ";
    }

    @Test
    void test_isPalindrome() {
        boolean actualResult = valid.isPalindrome(testcaseOne);
        assertTrue(actualResult);
    }

    @Test
    void test_isPalindrome_v2() {
        boolean actualResult = valid.isPalindrome(testcaseTwo);
        assertFalse(actualResult);
    }

    @Test
    void test_isPalindrome_V3() {
        boolean actualResult = valid.isPalindrome(testcaseThree);
        assertTrue(actualResult);
    }

}