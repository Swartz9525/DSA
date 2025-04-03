
import java.util.*;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        sc.close();
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
