import java.util.Scanner;

public class BLongestDivisorsInterval {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            int ans = 0;
            int i = 1;
            while(n%i==0){
                i++;
                ans++;
            }
            System.out.println(ans);
        }
    }
}