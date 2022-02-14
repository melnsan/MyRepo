package education.part1.task1;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void testIsYearLeap() {
        int[] expectedYears = {-392, 144, 2012, 2000, 1460};
        for(int expectedYear : expectedYears) {
            assertTrue(Solution.isYearLeap(expectedYear));
        }
    }
    @org.junit.jupiter.api.Test
    void testIsYearNotLeap() {
        int[] expectedYears = {-9, 150, 600, 1800, 1446};
        for(int expectedYear : expectedYears) {
            assertFalse(Solution.isYearLeap(expectedYear));
        }
    }
}

