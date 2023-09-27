package problemset.a0880;

public class DecodeStringAtIndex {

    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                size *= c - '0';
            else
                size++;
        }
        StringBuilder res = new StringBuilder();
        for (int j = n - 1; j >= 0;  j--) {
            char c = s.charAt(j);
            if (Character.isDigit(c)) {
                size /= c - '0';
                k %= size;
            } else if (k % size-- == 0) {
                res.append(c);
                break;
            }
        }
        return res.toString();
    }
}
