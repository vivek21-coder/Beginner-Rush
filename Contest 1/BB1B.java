import java.util.Scanner;

public class BB1B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(), m = scn.nextInt();
        int[] freq = new int[n];
        while (m-- > 0) {
            int ele = scn.nextInt();
            freq[ele - 1]++;
        }

        int min = Integer.MAX_VALUE;
        for (int val : freq) {
            min = Math.min(min, val);
        }

        System.out.println(min);
    }
}
