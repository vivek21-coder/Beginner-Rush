import java.util.Arrays;
import java.util.Scanner;

public class BB2A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Pair[] array = new Pair[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Pair(scn.nextInt(), i + 1);
        }

        Arrays.sort(array);

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            System.out.println(array[i].ind + " " + array[j].ind);
        }

    }

    static class Pair implements Comparable<Pair> {
        int val, ind;

        public Pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }
}