import java.util.Scanner;

public class robinhelps {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt() ;
        while(t-->0){
            int n = sc.nextInt();
            int k=sc.nextInt();
            int []g= new int [];
            for (int i=0;i<n;i++){
                g[i]=sc.nextInt();
            }
            int given=0;
            int taken=0;
            for (int i=0;i<n;i++){
                if (a[i]>=k)
                taken++;
                else 
                given++;
                taken--;
            }
        }
        System.out.println(given);

    }
    
}
