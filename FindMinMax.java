
import java.util.*;

public class FindMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.print("Enter the numbers of Array : ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array : " + Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min number : " + min + "\nMax number : " + max);
        sc.close();
    }
}
