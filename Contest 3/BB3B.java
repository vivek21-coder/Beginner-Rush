import java.util.Scanner;

public class BB3B {
    public static void main(String[] args) {

        long n=new Scanner(System.in).nextLong();

        if (n%2==0){
            System.out.println(n/2L);
        }else {
            System.out.println(-(n+1)/2L);
        }

    }
}
