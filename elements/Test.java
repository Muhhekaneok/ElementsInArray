package justforfun.array.elements;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        System.out.println("max element = " + getBiggestElement(array));
        System.out.println("min element = " + getSmallestElement(array));
    }

    private static int[] getArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - Math.random() * 65);
        }
        return array;
    }

    private static int getBiggestElement(int[] array) {
        int maxElem = array[0];
        for (int element : array)
            if (maxElem < element)
                maxElem = element;
        return maxElem;
    }

    private static int getSmallestElement(int[] array) {
        int minElem = array[0];
        for (int element : array)
            if (minElem > element)
                minElem = element;
        return minElem;
    }
}