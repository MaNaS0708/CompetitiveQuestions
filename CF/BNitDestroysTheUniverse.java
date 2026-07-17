import java.util.Scanner;

public class BNitDestroysTheUniverse {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();
            }

            int num = 0;

            for(int i = 0; i < n; i++){

                if(a[i]!=0){
                    if(i==0||a[i-1]==0){
                        num++;
                    }
                }
            }
            if(num == 0){
                System.out.println(0);
            }else if(num == 1){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}