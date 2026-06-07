import java.util.Scanner;

public class AOneAndTwo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while(t-- > 0){

            int n = sc.nextInt();

            int[] a = new int[n];
            int total = 0;

            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();
                if(a[i]==2){
                    total++;
                }

            }

            if(total%2 != 0){
                System.out.println(-1);
            }else if(total == 0){
                System.out.println(1);
            }else{
                int curr2 = 0, ans = -1;;
                
                for(int i = 0; i < n+1; i++){
                    if(a[i]==2){
                        curr2++;
                    }
                    if(curr2 == total/2){
                        ans = i+1;
                        break;
                    }
                }
                System.out.println(ans);
            }
            

        }

    }

}