package problemset.a0078;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class SubsetsTest {

    int[] test = new int[]{1, 2, 3};
    int[] test2 = new int[]{0};

    private Subsets subsets = new Subsets();

    @Test
    public void testSubsets() {
        List<List<Integer>> expectedResult = List.of(asList(1,2,3), asList(1,2), asList(1,3), asList(1), asList(2,3),
                asList(2), asList(3), asList());
        List<List<Integer>> actualResult = subsets.subsets(test);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    public void testSubsets_2() {
        List<List<Integer>> expectedResult = List.of(asList(0), asList());
        List<List<Integer>> actualResult = subsets.subsets(test2);
        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }
}