import java.util.Scanner;

public class BMultiplyBy2DivideBy6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int count2 = 0 , count3 = 0;
            Boolean poss = true;
            while(n>1 && poss){
                if(n%2==0){
                    count2++;
                    n=n/2;
                }else if(n%3 == 0){
                    count3++;
                    n=n/3;
                }else{
                    poss = false;
                }
            }
            if(!poss || count2>count3){
                System.out.println(-1);
            }else{
                System.out.println((count3-count2) + count3);
            }
        }
    }
}