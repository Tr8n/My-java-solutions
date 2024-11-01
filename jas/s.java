import java.util.Scanner;

public class s{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        System.out.println("Enter the numbers in your array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        }

        addOne(nums);
        
        System.out.println("Result after adding one:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

   
    public static void addOne(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] += 1;  
                return;       
            }
            nums[i] = 0;
        }

        System.out.print(1 + " "); 
    }
}
