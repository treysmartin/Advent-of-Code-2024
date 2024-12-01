package test.day1;

import main.AocDay;
import main.day1.DayOne;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayOneTest {
    
    DayOne underTest;

    @Test
    public void testDayOneSample1PartOne() throws Exception {
        String fileName = "test/day1/testSample1.txt";

        underTest = new DayOne(fileName);

        underTest.run();

        var results = underTest.getResults();

        assertEquals(11, results.get(AocDay.PART_ONE_KEY));
    }

    @Test
    public void testDayOnePartOne() throws Exception {
        underTest = new DayOne();

        underTest.run();

        var results = underTest.getResults();

        assertEquals(1320851, results.get(AocDay.PART_ONE_KEY));
    }

    @Test
    public void testDayOneSample1PartTwo() throws Exception {
        String fileName = "test/day1/testSample1.txt";

        underTest = new DayOne(fileName);

        underTest.run();

        var results = underTest.getResults();

        assertEquals(31, results.get(AocDay.PART_TWO_KEY));
    }

    @Test
    public void testDayOnePartTwo() throws Exception {
        underTest = new DayOne();

        underTest.run();

        var results = underTest.getResults();

        assertEquals(26859182, results.get(AocDay.PART_TWO_KEY));
    }
}
