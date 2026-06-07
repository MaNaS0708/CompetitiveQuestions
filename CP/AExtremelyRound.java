import java.util.Scanner;

public class AExtremelyRound{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            int len = n.length();

            int first = n.charAt(0) - '0';

            int count = (len-1)*9;

            count = count + first;

            System.out.println(count);

        }

    }

}