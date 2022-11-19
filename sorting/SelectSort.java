package justforfun.array.sorting;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, -2, 7, 5, -1, 9};
        System.out.println(Arrays.toString(getSelectedSortedArray(array)));
    }

    public static int[] getSelectedSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[iMin])
                    iMin = j;
            }
            int temp = array[i];
            array[i] = array[iMin];
            array[iMin] = temp;
        }
        return array;
    }
}