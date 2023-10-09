package problemset.a2303;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAmountPaidInTaxesTest {

    private CalculateAmountPaidInTaxes cal;

    private int[][] testcaseOne = new int[][]{{3,50},{7,10},{12,25}};
    private int testcaseIncomeOne = 10;
    private int[][] testcaseTwo = new int[][]{{1,0},{4,25},{5,50}};
    private int testcaseIncomeTwo = 2;
    private int[][] testcaseThree = {{2, 50}};
    private int testcaseIncomeThree = 0;
    @BeforeEach
    void setUp() {
        cal = new CalculateAmountPaidInTaxes();
    }

    @Test
    void calculateTax() {
        double expectedResult = 2.65000;
        double actualResult = cal.calculateTax(testcaseOne, testcaseIncomeOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateTax_V2() {
        double expectedResult = 0.25000;
        double actualResult = cal.calculateTax(testcaseTwo, testcaseIncomeTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateTax_V3() {
        double expectedResult = 0.00000;
        double actualResult = cal.calculateTax(testcaseThree, testcaseIncomeThree);
        assertEquals(expectedResult, actualResult);
    }
}