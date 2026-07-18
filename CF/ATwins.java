import java.util.Arrays;
import java.util.Scanner;

public class ATwins {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
            totalSum+=arr[i];
        }
        int sum1 = 0;
        int counter = 0;
        Arrays.sort(arr);
        for(int i = n-1; i >= 0; i--){
            totalSum -= arr[i];
            sum1 += arr[i];
            counter++;
            arr[i] = 0;

            if(sum1 > totalSum){
            System.out.println(counter);
            return;
            }
        }

    }
}