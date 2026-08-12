import java.util.Scanner;
public class AIlyaAndBankAccount {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0){
            System.out.println(n);
        }else{

            int option = n/10;

            int opt = (n/100) * 10+(n%10);

            System.out.println(Math.max(opt, option));
        }
    }
}