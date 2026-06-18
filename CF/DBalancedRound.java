import java.util.Arrays;
import java.util.Scanner;

public class DBalancedRound {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int ques = 1;
            int sub = 1;

            for(int i = 1; i < n; i++){
                if(a[i]-a[i-1]<=k){
                    sub++;
                }else{
                    sub = 1;
                }
                if(sub>ques){
                    ques = sub;
                }
                
            }
            System.out.println(n-ques);
        }
    }
}