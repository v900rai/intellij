package AdvancedDataStructureInJava;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9};
        int target = 7;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

}
