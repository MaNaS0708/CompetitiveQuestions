import java.util.Scanner;

public class ADesorting{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();

            }

            int minDiff = Integer.MAX_VALUE;
            boolean isSorted = true ;

            for(int i = 1; i < n; i++){

                if(a[i-1] > a[i]){
                    isSorted = false;
                    break;
                }

            }
            
            for(int i = 1; i < n; i++){

                int diff = a[i]-a[i-1];

                if(diff < minDiff){

                    minDiff = diff;

                }

            }

            if(!isSorted){
                System.out.println(0);
            }else{
                System.out.println((minDiff/2)+1);
            }

        }

    }

}