package problemset.a1441;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuildAnArrayWithStackOpaerationsTest {

    private BuildAnArrayWithStackOpaerations build;

    private int[] testcaseOne;
    private int testcaseOne_n;

    private int[] testcaseTwo;
    private int testcaseTwo_n;

    private int[] testcaseThree;
    private int testcaseThree_n;

    @BeforeEach
    void setUp() {
        build = new BuildAnArrayWithStackOpaerations();

        testcaseOne = new int[]{1, 3};
        testcaseOne_n = 3;

        testcaseTwo = new int[]{1, 2, 3};
        testcaseTwo_n = 3;
    }

    @Test
    void test_buildArray_v1() {
        List<String> expectedResult = List.of("Push", "Push", "Pop", "Push");
        List<String> actualResult = build.buildArray(testcaseOne, testcaseOne_n);
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }

    @Test
    void test_buildArray_v2() {
        List<String> expectedResult = List.of("Push", "Push", "Push");
        List<String> actualResult = build.buildArray(testcaseTwo, testcaseTwo_n);
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }
}