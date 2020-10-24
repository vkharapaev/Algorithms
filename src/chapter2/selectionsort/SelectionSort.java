package chapter2.selectionsort;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        int size = arr.length;
        int[] sorted = new int[size];
        for (int i = 0; i < size; i++) {
            int smallestIdx = findSmallest(arr);
            sorted[i] = arr[smallestIdx];
            arr = removeElement(arr, smallestIdx);
        }
        return sorted;
    }

    private static int findSmallest(int[] arr) {
        int smallestIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }

    private static int[] removeElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        return result;
    }
}
