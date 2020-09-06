import java.util.Arrays;
import java.util.Scanner;

public class BB2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(), k = scn.nextInt();

        int[] array = new int[k];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        int[] first = new int[n+1];
        Arrays.fill(first, k);
        for (int i = k - 1; i >= 0; i--) {
            first[array[i]] = i;
        }

        int[] last = new int[n+1];
        Arrays.fill(last, -1);
        for (int i = 0; i < k; i++) {
            last[array[i]] = i;
        }

        int ans = 0;

        // increasing pairs {1,2}, {2,3}, {3,4}, ...
        for (int a = 1, b = 2; a < n; a++, b++) {
            if (last[a] < first[b]) {
                ans++;
            }
        }

        // decreasing pairs {2,1}, {3,2}, {4,3}, ...
        for (int a = 2, b = 1; b < n; a++, b++) {
            if (last[a] < first[b]) {
                ans++;
            }
        }

        // same pairs {1,1}, {2,2}, {3,3}, ...
        for (int a = 1; a <= n; a++) {
            if (last[a] == -1) {
                ans++;
            }
        }

        System.out.println(ans);

    }
}
