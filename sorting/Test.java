package justforfun.array.sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int) (Math.random() * 10);
        System.out.println("original array:\t" + Arrays.toString(nums));
        sort(nums);
        System.out.print("sorted array:\t" + Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;                       // хранит индекс наименьшего элемента
            for (int j = i; j < nums.length; j++) { // находим наименьший элемент от i до конца массива
                System.out.println("nums[" + i + "] = " + nums[i] + ", nums[" + j + "] = " + nums[j]);
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                    System.out.println("\t" + nums[i] + " > " + nums[j] + ", minElement = " + nums[minIndex] + ", minIndex = " + minIndex);
                }
            }
            int tmp;
            tmp = nums[i]; System.out.println("tmp = nums[i] --> " + "tmp = nums[" + i + "] = " + nums[i]);
            nums[i] = nums[minIndex]; System.out.println("nums[i] = nums[minIndex] --> " +"nums[" + i + "] = nums[" + minIndex + "] = " + nums[minIndex]);
            nums[minIndex] = tmp; System.out.println("nums[minIndex] = tmp --> " + "nums[" + minIndex + "] = " + tmp);
            System.out.println("------" + i + "th loop: " + Arrays.toString(nums) + "\n");
        }
    }
}