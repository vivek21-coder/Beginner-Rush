import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BB3E {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        Pair[] B = new Pair[n];
        for (int i = 0; i < n; i++) {
            B[i] = new Pair(scn.nextInt(), i);
        }

        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[B[i].ind] = A[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int ele : ans) {
            sb.append(ele).append(" ");
        }

        System.out.println(sb);

    }

    static class Pair implements Comparable<Pair> {
        int val, ind;

        public Pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }


        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.val, o.val);
        }
    }
}
