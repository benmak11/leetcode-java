package problemset.a3516;

public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int distX = Math.abs(x - z);
        int distY = Math.abs(y - z);
        if (distX < distY)
            return 1;
        else if (distY < distX)
            return 2;

        return 0;
    }
}
