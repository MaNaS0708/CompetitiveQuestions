import java.util.Scanner;

public class AHowMuchDoesDaytonaCost{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            int n  = sc.nextInt();
            int k  = sc.nextInt();

            int[] arr = new int[n];

            boolean isk = false;

            for (int i =0; i<n; i++){

                arr[i] = sc.nextInt();

            }

            for (int element:arr){

                if (element == k){

                    isk = true;
                    break;

                }

            }

            if(!isk){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }


        }

    }

}