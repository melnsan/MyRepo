package education.part1.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    Solution object = new Solution();
    @Test
    void testIsYearLeapAD() {
        int[] expectedYears = {392, 144, 2012, 2000, 1460};
        for(int expectedYear : expectedYears) {
            assertTrue(object.isYearLeap(expectedYear));
        }
    }
    @Test
    void testIsYearNotLeapAD() {
        int[] expectedYears = {9, 150, 600, 1800, 1446};
        for(int expectedYear : expectedYears) {
            assertFalse(object.isYearLeap(expectedYear));
        }
    }
    @Test
    void testIsYearLeapBC() {
        int[] expectedYears = {-392, -144, -2012, -2000, -1460};
        for(int expectedYear : expectedYears) {
            assertTrue(object.isYearLeap(expectedYear));
        }
    }
    @Test
    void testIsYearNotLeapBC() {
        int[] expectedYears = {-9, -150, -600, -1800, -1446};
        for(int expectedYear : expectedYears) {
            assertFalse(object.isYearLeap(expectedYear));
        }
    }
}

