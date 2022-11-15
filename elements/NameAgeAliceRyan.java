package justforfun.array.elements;

/**
 * transpose matrix
 * name age
 * alice 21
 * ryan 30
 */
public class NameAgeAliceRyan {
    public static void main(String[] args) {
        String[][] sourceArray = {
                {"name", "age"},
                {"alice", "21"},
                {"ryan", "30"},
        };

        int m = 2;
        int n = 3;
        String[][] transArr = new String[m][n];

        System.out.println("-----origin array:-----");
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < sourceArray[i].length; j++) {
                System.out.print(sourceArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----transposed array:-----");
        for (int i = 0; i < transArr.length; i++) {
            for (int j = 0; j < transArr[i].length; j++) {
                transArr[i][j] = sourceArray[j][i];
                System.out.print(transArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}