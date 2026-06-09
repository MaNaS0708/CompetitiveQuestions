import java.util.Scanner;

public class AJellyfishAndUndertale {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            long a = sc.nextLong();
            long b =sc.nextLong();
            int n = sc.nextInt();

            long[] x = new long[n];
            long sec = b;

            for(int i = 0; i < n; i++){
                x[i] = sc.nextInt();
                sec += Math.min(x[i], (a-1));
            }

            System.out.println(sec);

        }

    }
}