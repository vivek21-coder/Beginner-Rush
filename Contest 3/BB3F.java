import java.util.Scanner;

public class BB3F {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(), m = scn.nextInt();

        int min = Math.min(n, m) + 1;

        System.out.println(min);

        for (int i = 0; i < min; i++) {
            System.out.println(min - i - 1 + " " + i);
        }

    }
}
