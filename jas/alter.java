import java.util.Scanner;

public class Alter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int result = isAlter(arr, n);
            System.out.println(result);
        }
        
        sc.close();
    }
    
    public static int isAlter(int[] arr, int n) {
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += arr[i];
            } else {
                result -= arr[i];
            }
        }
        
        return result;
    }
}
