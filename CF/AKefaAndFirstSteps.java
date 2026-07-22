import java.util.Scanner;

public class AKefaAndFirstSteps {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 1, x = 1;

        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }

        for(int i = 1; i < n; i++){
            if(arr[i] >= arr[i-1]){
                x++;
                if(count < x){
                    count = x;
                }
            }else{
                x = 1;
            }
        }
        System.out.println(count);
    }
}