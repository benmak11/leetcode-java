package problemset.a0931;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        var f = new int[n];
        for (var row : matrix) {
            var g = f.clone();
            for (int j = 0; j < n; j++) {
                if (j > 0) g[j] = Math.min(g[j], f[j - 1]);
                if (j + 1 < n) g[j] = Math.min(g[j], g[j + 1]);
                g[j] += row[j];
            }
            f = g;
        }
        int ans = Integer.MAX_VALUE;
        for (var x : f)
            ans = Math.min(ans, x);
        return ans;
    }
}
