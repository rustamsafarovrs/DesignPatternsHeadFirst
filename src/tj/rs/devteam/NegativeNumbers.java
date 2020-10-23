package tj.rs.devteam;

/**
 * @author Rustam Safarov(RS)
 * created at 19.10.2020
 */
public class NegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -4, 12, -90};

        int[] result = deleteNegativeNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    public static int[] deleteNegativeNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                newArray[index] = a[i];
                index++;
            }
        }
        return newArray;
    }

}
