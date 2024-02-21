package problemset.a0201;

public class BitwiseANDofNumbersRange {

    public int rangeBitwiseAnd(int left, int right) {
        while (left < right)
            right &= (right - 1);
        return right;
    }
}
