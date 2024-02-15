package problemset.a2971;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPolygonWIthTheLargestPerimeterTest {

    private FindPolygonWIthTheLargestPerimeter find;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;
    private int[] testcaseFour;

    @BeforeEach
    void setUp() {
        find = new FindPolygonWIthTheLargestPerimeter();
        testcaseOne = new int[]{5, 5, 5};
        testcaseTwo = new int[]{1, 12, 1, 2, 5, 50, 3};
        testcaseThree = new int[]{300005055,352368231,311935527,315829776,327065463,388851949,319541150,397875604,
                311309167,391897750,366860048,359976490,325522439,390648914,359891976,369105322,350430086,398592583,
                354559219,372400239,344759294,379931363,308829137,335032174,336962933,380797651,378305476,336617902,
                393487098,301391791,394314232,387440261,316040738,388074503,396614889,331609633,374723367,380418460,
                349845809,318514711,308782485,308291996,375362898,397542455,397628325,392446446,368662132,378781533,
                372327607,378737987};
        testcaseFour = new int[]{5, 5, 50};
    }

    @Test
    void test_largestPerimeter() {
        long expectedResult = 15L;
        long actualResult = find.largestPerimeter(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_largestPerimeter_2() {
        long expectedResult = 12L;
        long actualResult = find.largestPerimeter(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_largestPerimeter_3() {
        long expectedResult = 17876942274L;
        long actualResult = find.largestPerimeter(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_largestPerimeter_4() {
        long expectedResult = -1;
        long actualResult = find.largestPerimeter(testcaseFour);
        assertEquals(expectedResult, actualResult);
    }
}
