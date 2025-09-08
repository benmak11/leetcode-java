package problemset.a1317;

public class ConvertIntegerToTheSumOfTwoNoZeroInteger {

    public int[] getNoZeroIntegers(int n) {
        for (int first = 1; ; first++) {
            int second = n - first;

            String concat = first + "" + second;

            if (!concat.contains("0"))
                return new int[] {first, second};
        }
    }
}
