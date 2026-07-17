import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AAnotherPuzzleFromPapyrus {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            int time1 = 0;

            boolean possible1 = true;
            for(int i = 0; i < n; i++){

                if(a[i]<b[i]){
                    possible1 = false;
                    break;
                }
                time1 += (a[i]-b[i]);
            }

            int time2 = c;

            boolean possible2 = true;

            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    possible2 = false;
                    break;
                }
                time2 += (a[i] - b[i]);
            }

            if(!possible1 && !possible2){
                System.out.println(-1);
            }else if(!possible1){
                System.out.println(time2);
            }else if(!possible2){
                System.out.println(time1);
            }else{
                System.out.println(Math.min(time1, time2));
            }
            
            

        }
    }
}