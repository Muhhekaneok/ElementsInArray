package justforfun.array.elements;
//  1. найти наименьший элемент
//  2. найти второй по минимальности элемент
//  3. найти третий по минимальности элемент
//  4. найти четвертый по минимальности элемент
public class Test {
    public static void main(String[] args) {
        int[] array = {9, 7, -1, 8, 9, -4, 0, 5, 8, 2, 7};
//        int[] array = {3, 3, 3, 3, 3, 3};
        getMin(array);
    }

    public static void getMin(int[] array) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        int fourthMin = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < firstMin) {
                fourthMin = thirdMin;
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = i;
            } else if (i < secondMin && i != firstMin) {
                secondMin = i;
            } else if (i < thirdMin && i != firstMin) {
                thirdMin = i;
            } else if (i < fourthMin && i != firstMin) {
                fourthMin = i;
            }
        }
        System.out.println("firstMin = " + firstMin);
        if (secondMin != Integer.MAX_VALUE)
            System.out.println("secondMin = " + secondMin);
        if (thirdMin != Integer.MAX_VALUE)
            System.out.println("thirdMin = " + thirdMin);
        if (fourthMin != Integer.MAX_VALUE)
            System.out.println("fourth = " + fourthMin);
        else System.out.println("other doesn't exist");
    }
}