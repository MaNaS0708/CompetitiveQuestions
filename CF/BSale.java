import java.util.Arrays;
import java.util.Scanner;

public class BSale {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int money = 0;
        Arrays.sort(arr);
        for(int i = 0; i < m; i++){
            int x = arr[i];
            if(x<0){
                money+=(-1*x);
            }else{
                break;
            }
        }
        System.out.println(money);
    }
}