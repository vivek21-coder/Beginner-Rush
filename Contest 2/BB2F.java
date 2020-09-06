import java.util.Arrays;
import java.util.Scanner;

public class BB2F {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(),
                m = scn.nextInt();
        long k = scn.nextLong();
        int x = scn.nextInt(), y = scn.nextInt();

        long[][] matrix = new long[n][m];

        long cycleSize = (n == 1) ? m : m * 2 * (n - 1);
        long leftQues=k;

        // full cycles
        if (cycleSize > 0) {
            long cycles = k / cycleSize;

            leftQues = k % cycleSize;

            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    Arrays.fill(matrix[i], cycles);
                } else {
                    Arrays.fill(matrix[i], 2 * cycles);
                }
            }
        } else
            leftQues = k;


        // other than cycles ques
        int i = 0, j = 0;
        boolean rev = false;
        while (leftQues-- > 0) {
            matrix[i][j]++;
            j++;
            if (j == m) {
                j = 0;
                if (rev) i--;
                else {
                    i++;
                    if (i == n) {
                        rev = true;
                        i -= 2;
                    }
                }
            }
        }

        long max = 0, min = Long.MAX_VALUE;
        for (int p = 0; p < n; p++) {
            for (int q = 0; q < m; q++) {
                max = Math.max(max, matrix[p][q]);
                min = Math.min(min, matrix[p][q]);
            }
        }

        System.out.println(max + " " + min + " " + matrix[x - 1][y - 1]);

    }
}
