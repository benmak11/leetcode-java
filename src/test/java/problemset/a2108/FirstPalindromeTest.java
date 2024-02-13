package problemset.a2108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstPalindromeTest {

    private FirstPalindrome first;
    private String[] testcaseOne;
    private String[] testcaseTwo;
    private String[] testcaseThree;

    @BeforeEach
    public void setup() {
        first = new FirstPalindrome();
        testcaseOne = new String[]{"abc", "car", "ada", "racecar", "cool"};
        testcaseTwo = new String[]{"notapalindrome", "racecar"};
        testcaseThree = new String[]{"def", "ghi"};
    }

    @Test
    public void test_firstPalindrome() {
        String expectedResult = "ada";
        String actualResult = first.firstPalindrome(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_firstPalindrome_2() {
        String expectedResult = "racecar";
        String actualResult = first.firstPalindrome(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_firstPalindrome_3() {
        String expectedResult = "";
        String actualResult = first.firstPalindrome(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}