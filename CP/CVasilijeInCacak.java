import java.util.Scanner;

public class CVasilijeInCacak{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long minSum = (k*(k+1)/2);

            long small = ((n-k)*(n-k+1))/2;

            long total = (n*(n+1))/2;

            long maxSum = total - small;

            if(x <= maxSum && minSum <= x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }

}