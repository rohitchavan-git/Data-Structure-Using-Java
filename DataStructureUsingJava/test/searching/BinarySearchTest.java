package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void searchReturnsTrueForSingleElementArray() {
        BinarySearch bs = new BinarySearch();
        int[] arr = {5};
        assertTrue(bs.search(arr, 5));
    }

    @Test
    public void searchReturnsFalseForMissingKeyInSingleElementArray() {
        BinarySearch bs = new BinarySearch();
        int[] arr = {5};
        assertFalse(bs.search(arr, 3));
    }

    @Test
    public void searchReturnsTrueForKeyPresentInMultiElementArray() {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9};
        assertTrue(bs.search(arr, 7));
    }

    @Test
    public void searchReturnsFalseForMissingKeyInMultiElementArray() {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9};
        assertFalse(bs.search(arr, 2));
    }
}
