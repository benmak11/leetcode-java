package problemset.a3607;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerGridMaintenanceTest {

    private PowerGridMaintenance powerGridMaintenance;
    private int c1;
    private int[][] connections1;
    private int[][] queries1;


    @BeforeEach
    void setUp() {
        powerGridMaintenance = new PowerGridMaintenance();
        c1 = 5;
        connections1 = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        queries1 = new int[][]{
                {1, 3},
                {2, 1},
                {1, 1},
                {2, 2},
                {1, 2}
        };
    }

    @Test
    void test_processQueries() {
        int[] expected = new int[]{3, 2, 3};
        int[] actual = powerGridMaintenance.processQueries(c1, connections1, queries1);
        assertArrayEquals(expected, actual);
    }
}