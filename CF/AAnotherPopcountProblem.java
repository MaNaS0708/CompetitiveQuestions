import java.util.Scanner;

public class AAnotherPopcountProblem {

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k >= n) {
                    System.out.println(n);
                    continue;
            }

            long total = 0;

            for(int i = 30; i > 0; i--){

                long current = (1L << i)-1;
                if(n>=current && k>1){
                    long canTakeByBudget = n / current;
                    long canTakeByPockets = k - 1;
                    long take = Math.min(canTakeByBudget, canTakeByPockets);
                    n -= (take * current);
                    k -= take;
                    total += (take * i);
                }
            }
            if(n>0 && k >0){
                total += Long.bitCount(n);
            }
            System.out.println(total);
        }
    }
}