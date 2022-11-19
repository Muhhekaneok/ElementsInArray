package justforfun.array.elements;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arrInteger = new Integer[]{3, 4, -2, 7, 3, -1, 9};
        removeDuplicatesZero(arrInteger);
    }

    static void removeDuplicatesZero(Integer[] array) {
        List<Integer> uniqueList = Arrays.stream(array).distinct().toList();
        System.out.println(Arrays.toString(uniqueList.toArray()));
    }
}