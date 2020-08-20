import java.util.Scanner;

public class BB1C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        switch (n) {
            case 1:
            case 2:
                System.out.println("1\n1");
                return;
            case 3:
                System.out.println("2\n1 3");
                return;
            case 4:
                System.out.println("4\n3 1 4 2");
                return;
        }

        int[] ans = new int[n];
        int num = 1;
        for (int i = 0; i < n; i += 2, num++) {
            ans[i] = num;
        }

        for (int i = 1; i < n; i += 2, num++) {
            ans[i] = num;
        }
        System.out.println(n);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
