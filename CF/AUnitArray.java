import java.util.Arrays;
import java.util.Scanner;

public class AUnitArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            long neg = Arrays.stream(a).filter(x -> x < 0).count();
            long pos = Arrays.stream(a).filter(x -> x > 0).count();

            int ops = 0;

            while(neg > pos){
                ops++;
                neg--;
                pos++;
            }

            if(neg%2!=0){
                ops++;
            }

            System.out.println(ops);

        }

    }

}