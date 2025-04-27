
import java.util.*;

public class Leetcode_3392 {

    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] % 2 == 0 && nums[i] + nums[i + 2] == nums[i + 1] / 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Leetcode_3392 solution = new Leetcode_3392();
        System.out.println(solution.countSubarrays(nums));
        sc.close();
    }
}
