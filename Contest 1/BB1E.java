import java.util.Scanner;

public class BB1E {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int m=scn.nextInt();
        int n=scn.nextInt();

        int[][] mat=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=scn.nextInt();
            }
        }

        int[][] dp=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i==0){
                    if (j==0){
                        dp[j][i]=mat[j][i];
                        continue;
                    }
                    dp[j][i]=dp[j-1][i]+mat[j][i];
                    continue;
                }

                if (j==0){
                    dp[j][i] = dp[j][i-1]+mat[j][i];
                    continue;
                }
                dp[j][i] = Math.max(dp[j-1][i],dp[j][i-1])+mat[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(dp[i][n-1]+" ");
        }
    }
}
