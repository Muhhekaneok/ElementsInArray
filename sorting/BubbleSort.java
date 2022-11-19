package justforfun.array.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, -2, 7, 5, -1, 9};
        System.out.println(Arrays.toString(getBubbleSortedArray(array)));
    }

    public static int[] getBubbleSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}