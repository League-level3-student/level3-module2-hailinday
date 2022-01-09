package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] intArr = {"w","b","a","d","ax","words","stt"};
    	assertEquals(5, _01_LinearSearch.linearSearch(intArr, "words"));
    
    	assertEquals(2, _01_LinearSearch.linearSearch(intArr, "a"));

    	assertEquals(3, _01_LinearSearch.linearSearch(intArr, "d"));
    
    	assertEquals(-1, _01_LinearSearch.linearSearch(intArr, "kljfsdf"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    	assertEquals(5, _02_BinarySearch.binarySearch(intArr, 0, 11, 6));
    	assertEquals(9, _02_BinarySearch.binarySearch(intArr, 0, 11, 10));
    	assertEquals(4, _02_BinarySearch.binarySearch(intArr, 0, 11, 5));
    	assertEquals(-1, _02_BinarySearch.binarySearch(intArr, 0, 11, 14));


    }
}
