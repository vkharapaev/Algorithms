package chapter1.binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

// (high - low) / 2 + low  => (high - low + 2*low) / 2 => (high + low)/2