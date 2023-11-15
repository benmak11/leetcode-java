package problemset.a1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfStudentsCantEatSandwichesTest {
    private NumOfStudentsCantEatSandwiches num;
    private int[] testcaseOne_students;
    private int[] testcaseOne_sandwiches;
    private int[] testcaseTwo_students;
    private int[] testcaseTwo_sandwiches;
    @BeforeEach
    void setUp() {
        num = new NumOfStudentsCantEatSandwiches();
        testcaseOne_students = new int[]{1, 1, 0, 0};
        testcaseOne_sandwiches = new int[]{0, 1, 0, 1};
        testcaseTwo_students= new int[]{1, 1, 1, 0, 0, 1};
        testcaseTwo_sandwiches = new int[] {1, 0, 0, 0, 1, 1};
    }

    @Test
    void test_countStudents_v1() {
        int expectedResult = 0;
        int actualResult = num.countStudents(testcaseOne_students, testcaseOne_sandwiches);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_countStudents_v2() {
        int expectedResult = 3;
        int actualResult = num.countStudents(testcaseTwo_students, testcaseTwo_sandwiches);
        assertEquals(expectedResult, actualResult);
    }
}