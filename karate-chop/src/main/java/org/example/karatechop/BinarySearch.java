package org.example.karatechop;

public class BinarySearch {

    public int chop(int numberToSearch, int[] array) {

        return binarySearch(array, 0, array.length - 1, numberToSearch);
    }

    private static int binarySearch(int[] array, int start, int end, int numberToFind) {
        if (end >= start) {
            int middle = start + (end - start) / 2;

            // If the element is present at the
            // middle itself
            if (array[middle] == numberToFind)
                return middle;

            // If element is smaller than middle, then
            // it can only be present in left subarray
            if (array[middle] > numberToFind)
                return binarySearch(array, start, middle - 1, numberToFind);

            // Else the element can only be present
            // in right subarray
            return binarySearch(array, middle + 1, end, numberToFind);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
