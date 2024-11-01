import java.util.ArrayList;
import java.util.Scanner;

public class arralis {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
    
        System.out.println("Enter the numbers in your array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
      
        System.out.println("Enter a number to find in the array:");
        int target = sc.nextInt();
    
        System.out.println(isPresent(nums, target, 0));
    }

    public static ArrayList<Integer> isPresent(int[] nums, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (nums.length == index) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        
        ArrayList<Integer> belowCallList = isPresent(nums, target, index + 1);
        list.addAll(belowCallList);
        
        return list;
    }
}
