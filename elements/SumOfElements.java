package justforfun.array.elements;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 - 2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum = " + sum(arr, 0));
    }

    private static int sum(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return arr[index] + sum(arr, index + 1);
    }
}
