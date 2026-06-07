import java.util.Scanner;

public class AElephant{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ops = 0;
        while(n>5){
            ops++;
            n=n-5;
        }

        System.out.println(ops + 1);

    }

}