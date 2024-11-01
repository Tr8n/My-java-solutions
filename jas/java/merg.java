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
        System.out.println(canMerge(nums));
    }

    public static boolean canMerge(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        return merg(left,right);
    }
    public int merg(int [] left,int [] right,int [] ans){
        int i = 0, j = 0, k = 0;
        while(i<left.length() &&  j<right.length()){
            if ()
        }
    }
}