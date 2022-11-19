package justforfun.array.elements;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {20, 7, 9, 31, -3, 14, -5, 0};
        Arrays.sort(array);
        System.out.println(binarySearch(array, -5));
    }

    public static int binarySearch(int[] array, int element) {
        int middle = array.length / 2;
        int left = 0;
        int right = array.length - 1;

        while (left < right && right - left > 1) {
            if (element < array[middle]) // -5 -3 0 7 9 14 20 31
                right = middle;
            else left = middle;
            middle = (left + right) / 2;
        }
        if (array[left] == element)
            return left;
        if (array[right] == element)
            return right;
        return -1;
    }
}