import java.util.Arrays;
import java.util.Scanner;

public class fibodp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Fibonacci of " + n + " is: " + isfebo(dp, n));

        sc.close();
    }

    public static int isfebo(int[] dp, int n) {
        if (n == 0 || n == 1) return n;

        if (dp[n] != -1) return dp[n];
  

        
        dp[n] = isfebo(dp, n - 1) + isfebo(dp, n - 2);

        return dp[n];
    }
}
