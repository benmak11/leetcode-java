package random.googlefoobar.level1;

public class Solution {
    public final static String space = "000000";
    public final static String upper = "000001";
    public final static String[] letter = new String[]{
            "100000", // a
            "110000", // b
            "100100", // c
            "100110", // d
            "100010", // e
            "110100", // f
            "110110", // g
            "110010", // h
            "010100", // i
            "010110", // j
            "101000", // k
            "111000", // l
            "101100", // m
            "101110", // n
            "101010", // o
            "111100", // p
            "111110", // q
            "111010", // r
            "011100", // s
            "011110", // t
            "101001", // u
            "111001", // v
            "010111", // w
            "101101", // x
            "101111", // y
            "101011", // z
    };

    public static String solution(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            sb.append(getIntegerValue(c));
        }
        return sb.toString();
    }

    public static String getIntegerValue(char c) {
        if (c == ' ') return space;
        StringBuilder b = new StringBuilder();
        int diff = 0;
        if (Character.isUpperCase(c)) {
            diff = (int) c - (int) 'A';
            b.append(upper);
        } else
            diff = (int) c - (int) 'a';

        b.append(letter[diff]);
        return b.toString();
    }

    public static void main(String[] args) {
        String plaintext1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(Solution.solution(plaintext1));

    }
}