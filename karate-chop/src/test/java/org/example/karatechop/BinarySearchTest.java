package org.example.karatechop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    private BinarySearch search;

    @Before
    public void setUp() throws Exception {
        search = new BinarySearch();
    }

    @Test
    public void searchNumberNotExistInArray() {
        int result = search.chop(2, new int[]{1, 5});
        assertEquals(-1, result);
    }

    @Test
    public void searchOneInArrayWithTwoElementsAsFirst() {

        int result = search.chop(1, new int[]{1, 5});
        assertEquals(0, result);
    }

    @Test
    public void searchOneInArrayWithTwoElementsAsSecond() {

        int result = search.chop(1, new int[]{-2, 1});
        assertEquals(1, result);
    }

    @Test
    public void searchTwoInArrayWithTwoELements() {
        int result = search.chop(2, new int[]{2, 5});
        assertEquals(0, result);
    }

    @Test
    public void searchFiveInArrayWithTenElementsAndFiveRepeat() {
        int result = search.chop(5, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 5, 8, 9, 0});
        assertEquals(5, result);
    }
}
