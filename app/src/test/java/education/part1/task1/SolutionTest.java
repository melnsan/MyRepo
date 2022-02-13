package education.part1.task1;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void testIsYearLeap() {
        int[] expectedYears = {2000};
        //boolean [] isExpectedYearsLeap = {false, false, false, true};
        for (int expectedYear : expectedYears) {
            assertTrue(Solution.isYearLeap(expectedYear));
        }
    }
    @org.junit.jupiter.api.Test
    void testIsYearNotLeap() {
        int[] expectedYears = {9, 150, 600};
        for(int i=0; i < expectedYears.length; i++){
            assertFalse(Solution.isYearLeap(expectedYears[i]));
        }
    }
}

