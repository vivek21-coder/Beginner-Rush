import java.util.ArrayList;
import java.util.Scanner;

public class BB1D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = Math.max(n - 100, 1); i < n; i++) {
            if (isMagical(i, n)) {
                list.add(i);
            }
        }

        System.out.println(list.size());
        for (int ele : list) {
            System.out.print(ele + " ");
        }

    }

    public static boolean isMagical(int num, int target) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum == target;
    }
}
