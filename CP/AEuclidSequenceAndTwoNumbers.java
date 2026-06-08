import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class AEuclidSequenceAndTwoNumbers{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();

            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            Arrays.sort(b);

            int x = b[n-1];
            int y = b[n-2];
            boolean valid = true;

            for(int i = n-3; i >= 0; i--){
                if(x%y == b[i]){
                    x = y;
                    y = b[i];
                }else{
                    valid = false;
                    break;
                }
            }
            if(!valid){
                System.out.println(-1);
            }else{
                System.out.println(b[n-1] +" " + b[n-2]);
                
            }

        }

    }

}