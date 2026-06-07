import java.util.Arrays;
import java.util.Scanner;

public class AServalAndMochaSArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i  = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean foundValidPair = false;

            for(int i = 0; i < n; i++){
                
                for(int j = i+1; j < n; j++){

                    int x = a[i];
                    int y = a[j];

                    while(y!= 0){
                        int remainder = x%y;
                        x = y;
                        y = remainder;
                    }

                    if(x <=2){
                        foundValidPair = true;
                        break;
                    }

                }
                if(foundValidPair) {
                    break;
                }

            }

            if (foundValidPair) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }

}