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
        System.out.println("rotate by 3 to <-- " + Arrays.toString(rotateToTheLeft(arr, 3)));
        System.out.println("rotate by 3 to --> " + Arrays.toString(rotateToTheRight(arr, 3)));
    }

    static int[] rotateToTheLeft(int[] array, int shift) {
        int length = array.length;
        int[] rotatedArr = new int[length];

        int rotatedArrayIndex = 0;

        for (int i = shift; i < length; i++) {
            rotatedArr[rotatedArrayIndex] = array[i];
            rotatedArrayIndex++;
        }

        for (int i = 0; i < shift; i++) {
            rotatedArr[rotatedArrayIndex] = array[i];
            rotatedArrayIndex++;
        }
        return rotatedArr;
    }

    static int[] rotateToTheRight(int[] array, int shift) {
        shift = shift % array.length;   // If rotation is greater than size of array
        int length = array.length;
        int[] rotatedArr = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < shift) {
                rotatedArr[i] = array[length + i - shift];
            } else {
                rotatedArr[i] = array[i - shift];
            }
        }
        return rotatedArr;
    }
}