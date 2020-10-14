import java.util.Scanner;

public class BB3A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        StringBuilder sb = new StringBuilder();
        int c=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j)%2==0){
                    sb.append('C');
                    c++;
                }else {
                    sb.append('.');
                }
            }
            sb.append('\n');
        }

        System.out.println(c);
        System.out.print(sb);
    }
}
