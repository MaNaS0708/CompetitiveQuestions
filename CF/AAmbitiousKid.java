import java.util.Scanner;

public class AAmbitiousKid{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){

            arr[i] = sc.nextInt();

        }

        int min = Math.abs(arr[0]);

        for (int i = 0; i < n; i++){

            if (Math.abs(arr[i]) < min){
                min = Math.abs(arr[i]);
            }

        }

        System.out.println(min);


    }

}