import java.util.Scanner;

public class BPermutationSwap {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            int maxK = 0;

            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                int diff =  Math.abs(a[i]-(i+1));
                maxK = getGCD(maxK,diff);
            }

            System.out.println(maxK);




        }
    }
    public static int getGCD(int a, int b){
        while (b!=0) {
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;

    }
}
