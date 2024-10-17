package problemset.a0162;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindPeakElementAlteredTest {

    private FindPeakElementAltered peak = new FindPeakElementAltered();

    int[] test = new int[] {3, 4, 5, 6, 7, 8, 9, 8, 7};

    int[] test2 = new int[] {4, 5, 6, 7, 8, 9};

    @Test
    public void findPeakElement() {
        int res = peak.findPeakElement(test);
        assertEquals(9, res);
    }

    @Test
    public void findPeakElement2() {
        int res = peak.findPeakElement(test2);
        assertEquals(-1, res);
    }
}