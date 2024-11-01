import java.util.*;
public class soln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a");
        int a = sc.nextInt();
        System.out.println("enter a value fro b");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c + "1");
        sc.close(); // Closing the Scanner to avoid resource leaks
    }
}
