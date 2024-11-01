import java.util.*;

public class MinimumSubsetSumDifference {

    // Function to find the minimum subset sum difference
    public static int minSubsetSumDifference(int[] arr) {
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();  // Calculate the total sum

        // Create a DP table to store possible sums
        boolean[][] dp = new boolean[n + 1][sum / 2 + 1];

        // Initialize the first column as true (sum 0 is always possible)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum / 2; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Find the largest j such that dp[n][j] is true
        int closestSubsetSum = 0;
        for (int j = sum / 2; j >= 0; j--) {
            if (dp[n][j]) {
                closestSubsetSum = j;
                break;
            }
        }

        // Calculate the minimum difference
        int minDifference = Math.abs(sum - 2 * closestSubsetSum);
        return minDifference;
    }

    // Main method to test the code with random input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Creating the array with random elements
        int[] arr = new int[n];
        System.out.println("Generating random array elements between 1 and 100:");
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100) + 1;  // Random number between 1 and 100
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // New line for better formatting

        // Call the minSubsetSumDifference function and print the result
        int result = minSubsetSumDifference(arr);
        System.out.println("The minimum subset sum difference is: " + result);
    }
}
