import java.util.Arrays;
import java.util.Scanner;

public class BArrayCloningTechnique {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){

                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int max = 1, cnt = 1;
            for(int i = 1; i < n; i++){

                if(arr[i]==arr[i-1]){
                    cnt++;
                }else{
                    cnt = 1;
                }
                if (cnt > max) {
                    
                    max = cnt;
                }
            }
            int ops = n - max;
            int current = max;
            while(current<n){
                ops++;
                current*=2;
            }

            System.out.println(ops);
            
        }
    }
}