import java.util.Arrays;
import java.util.Scanner;

public class AExpression {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] expressions = {a+b+c , a*b*c, (a*b)+c, a+(b*c), a*(b+c), (a+b)*c};

        Arrays.sort(expressions);
        System.out.println(expressions[5]);

    }
}