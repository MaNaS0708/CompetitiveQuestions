import java.util.Scanner;

public class AWeNeedTheZero{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();

            }

            if(n%2 == 0){
                int xor = 0;
                for(int x : a){
                    xor = xor ^ x;
                }
                if (xor == 0){
                    System.out.println(1);
                }else{
                    System.out.println(-1);
                }
            }else{
                int xor = 0;
                for(int x : a){
                    xor = xor ^ x;
                }
                System.out.println(xor);
            }

        }

    }

}