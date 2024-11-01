import java.util.Random;
class countofsubsetsum {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];

        // Initialize dp table
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        // Populate the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][target];
  }
    public static void main(String[] args) {
        // Create a random array of length between 1 to 50
        Random rand = new Random();
        int length = rand.nextInt((10000) + 1)%100; // Length between 1 and 50

        int[] nums = new int[length];
        int target = rand.nextInt(100) + 1; // Random target between 1 and 100

        // Fill array with random values between 1 and 100
        for (int i = 0; i < length; i++) {
            nums[i] = rand.nextInt(1050) + 1;
        }
        // Print random input
        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget: " + target);
        // Call the function and print the result
        Solution solution = new Solution();
        int result = solution.numSubseq(nums, target);
        System.out.println("Result: " + result);
    }
}
