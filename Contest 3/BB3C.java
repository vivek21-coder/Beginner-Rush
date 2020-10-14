import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BB3C {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();

        int[] arr = new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = scn.nextInt();
        }

        int permuts = (int) Math.pow(2, 12);

        int[] sums = new int[permuts];

        int mult = permuts / 2;

        for (int i = 0; i < 12; i++) {
            boolean shouldAdd = false;
            int p = 0;
            while (p < permuts) {
                if (shouldAdd) {
                    for (int j = 0; j < mult; j++) {
                        sums[p] += arr[i];
                        p++;
                    }
                } else {
                    p += mult;
                }
                shouldAdd = !shouldAdd;
            }
            mult /= 2;
        }
        System.out.println(min(sums, k));
    }

    private static int min(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= k) {
                list.add(i);
            }
        }

        if (list.isEmpty()) return -1;

        int min = Integer.MAX_VALUE;
        for (int ele : list) {
            if (Integer.bitCount(ele) < Integer.bitCount(min)) {
                min = ele;
            }
        }

        return Integer.bitCount(min);
    }
}
