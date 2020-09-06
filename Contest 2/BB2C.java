import java.util.Scanner;

public class BB2C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int curr = 0;

        for (int i = 0; i < n; i++) {

            int num = scn.nextInt();

            curr = (curr + num - 1);

            curr %= 2;

            System.out.println(curr == 0 ? 2 : 1);
        }

    }
}
