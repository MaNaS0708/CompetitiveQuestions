import java.util.Scanner;

public class ATheEqualizer{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            long sum = 0;

            for (int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }

            if (sum%2 != 0 || (k*n)%2 == 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }

    }

}