import java.util.Arrays;
import java.util.Scanner;

public class AArrayColoring{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++){

                a[i] = sc.nextInt();

            }

            long oddCount = Arrays.stream(a).filter(x -> x%2 != 0).count();

            if(oddCount % 2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }

}