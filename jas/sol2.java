import java.util.Scanner;

public class sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for your array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Enter a number to find in the array:");
        int target = sc.nextInt();
        
        System.out.println("The element is present at index: " + isPresent(nums, 0, target));
    }
    
    public static int isPresent(int[] nums, int index, int target) {
        if (index == nums.length) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        }
        return isPresent(nums, index + 1, target);
    }
}
