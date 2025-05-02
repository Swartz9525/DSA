
import java.util.Scanner;

public class Leetcode_838 {

    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] forces = new int[n];

        int force = 0;
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                force = n;
            } else if (dominoes.charAt(i) == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }

        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                force = n;
            } else if (dominoes.charAt(i) == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (int f : forces) {
            if (f > 0) {
                result.append('R');
            } else if (f < 0) {
                result.append('L');
            } else {
                result.append('.');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Leetcode_838 solution = new Leetcode_838();
        System.out.print("Enter the dominoes string : ");
        Scanner scanner = new Scanner(System.in);
        String dominoes = scanner.nextLine();
        scanner.close();
        String result = solution.pushDominoes(dominoes);
        System.out.println(result);
    }
}
