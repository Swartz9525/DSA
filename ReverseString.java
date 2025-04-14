
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'R', 'e', 'v', 'e', 'r', 's', 'e', 'S', 't', 'r', 'i', 'n', 'g'};
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        // Print reversed string
        System.out.println(s); // or use: System.out.println(String.valueOf(s));
    }
}
