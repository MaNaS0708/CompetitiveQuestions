import java.util.Scanner;

public class CPrependAndAppend{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            String str = sc.next();

            while(str.length() >= 2 && checkCondition(str)){

                str = str.substring(1 , str.length()-1);

            }

            System.out.println(str.length());

        }

    }

    public static boolean checkCondition(String str){

        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        if((f == '1' && l == '0') || (f == '0' && l == '1')){

            return(true);

        }else{
            return(false);
        }

    }

}