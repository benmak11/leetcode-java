package problemset.a2485;

public class FIndThePivotInteger {

    public int pivotInteger(int n) {
        int s = n * (n + 1) / 2;

        int sqrt = (int) Math.sqrt(s);

        if (sqrt * sqrt == s) return sqrt;
        else return -1;
    }
}
