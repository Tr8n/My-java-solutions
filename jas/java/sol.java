import java.util.*;

class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        System.out.println("Enter the numbers in your array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();  // Use nextInt() for integer input
        }
        
        System.out.println(isSorted(nums, 0));
    }
    
    public static boolean isSorted(int[] nums, int index) {  // Corrected to int[] nums
        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] <= nums[index + 1] && isSorted(nums, index + 1);  // Compare array elements
    }
}
