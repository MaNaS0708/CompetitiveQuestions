import java.util.Scanner;

public class BBlankSpace{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();

            }

            int space = 0;
            int max = 0;
            
            for(int x : a){
                if(x == 0){
                    space++;
                    if(space > max){
                        max = space;
                    }
                }else{
                    space = 0;
                }
            }

            System.out.println(max);

        }

    }

}