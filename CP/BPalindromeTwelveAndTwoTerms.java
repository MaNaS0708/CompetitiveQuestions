import java.util.Scanner;

public class BPalindromeTwelveAndTwoTerms{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        while(t-- > 0){

            long n = sc.nextLong();

            long ansb = 0;
            long ansa = 0;

            boolean isFound = false;

            for(long a = 0; a <=1000; a++){
                if(n>=a){

                    long b = n-a;
                    if(b%12==0){
                        if(isPalin(a)){
                            isFound = true;
                            ansa = a;
                            ansb = b;
                            break;
                        }
                    }

                }
            }
            
            if(!isFound){
                System.out.println(-1);
            }else{
                System.out.println(ansa +" "+ ansb);
            }

        }

    }

    public static boolean isPalin(long a){

        long org = a;
        long rev = 0;
        while(org>0){
            long remain = org%10;
            rev = rev*10+remain;
            org = org/10;
        }
        return a == rev;

    }

}