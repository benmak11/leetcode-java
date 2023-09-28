package problemset.a0905;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    private SortArrayByParity sort = new SortArrayByParity();

    private int[] testcase_1 = new int[]{3, 1, 2, 4};
    private int[] testcase_2 = new int[]{0};


    @Test
    void testSortArrayByParity_1() {
        int[][] possibleAnswers = new int[][]{{4, 2, 3, 1}, {2, 4, 1, 3,}, {4, 2, 1, 3}};

        int[] actualResult = sort.sortArrayByParity(testcase_1);

        for (int[] arr : possibleAnswers) {
            if (arr[0] == actualResult[0]) {
                int cnt = 1;
                boolean pass = true;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == actualResult[i])
                        cnt++;
                    else {
                        pass = false;
                        continue;
                    }
                    if (cnt == arr.length)
                        break;
                }
                if (pass)
                    assertArrayEquals(arr, actualResult);
            }
        }
    }

    @Test
    void testSortArrayByParity_2() {
        int[][] possibleAnswers = new int[][]{{0}};

        int[] actualResult = sort.sortArrayByParity(testcase_1);

        for (int[] arr : possibleAnswers) {
            if (arr[0] == actualResult[0]) {
                int cnt = 1;
                boolean pass = true;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == actualResult[i])
                        cnt++;
                    else {
                        pass = false;
                        continue;
                    }
                    if (cnt == arr.length)
                        break;
                }
                if (pass)
                    assertArrayEquals(arr, actualResult);
            }
        }
    }

}