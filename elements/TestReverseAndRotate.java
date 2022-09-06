package justforfun.array.elements;

import java.util.Arrays;

public class TestReverseAndRotate {
    public static void main(String[] args) {
        int length = (int) (Math.random() * 10 + 1);
        int[] arrayA = new int[length];
        for (int i = 0; i < arrayA.length; i++)
            arrayA[i] = (int) (Math.random() * 10 + 1);
        System.out.println("source array = " + Arrays.toString(arrayA));

        for (int i = 0; i < arrayA.length / 2; i++) {
            int tmp = arrayA[i];
            arrayA[i] = arrayA[arrayA.length - 1 - i];
            arrayA[arrayA.length - 1 - i] = tmp;
        }
        System.out.println("reversed array = " + Arrays.toString(arrayA));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("source array = " + Arrays.toString(arr));
        rotateArray(arr, 3);
        System.out.println("rotated array = " + Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[i];
            arr[i] = tmp;
        }
    }
}