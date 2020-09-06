import java.util.Scanner;

public class BB2B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        char[] array = scn.next().toCharArray();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i + 2 < n &&
                    array[i] == 'o' &&                   // aogogob
                    array[i + 1] == 'g' &&              // ans = a***b
                    array[i + 2] == 'o') {
                ans.append("***");
                i+=2;
            } else if (i + 1 < n &&
                    ans.length() > 0 &&
                    ans.charAt(ans.length() - 1) == '*' &&
                    array[i] == 'g' &&
                    array[i + 1] == 'o') {
                i++;
            } else {
                ans.append(array[i]);
            }
        }

        System.out.println(ans);
    }
}
