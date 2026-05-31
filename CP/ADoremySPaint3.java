import java.util.Scanner;
import java.util.Arrays;

public class ADoremySPaint3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- >0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            int n1 = 0;
            int n2 = 0;

            for (int i = 0; i < n; i++){

                arr[i] = sc.nextInt();

            }

            long unique = Arrays.stream(arr).distinct().count();

            if (unique > 2){

                System.out.println("No");

            }else if(unique == 1){

                System.out.println("Yes");

            }else{

                int ni = arr[0];

                for (int i = 0; i < n; i++){

                    if (arr[i]==ni){
                        n1++;
                    }else{
                        n2++;
                    }

                }

                if ( Math.abs(n1-n2)==1 || Math.abs(n1-n2)==0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }

        }

    }

}