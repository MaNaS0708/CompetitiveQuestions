import java.util.Scanner;

public class AGameWithSticks {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        while(n >=1 && m >= 1){
            count++;
            n--;
            m--;
        }
        if(count%2 == 0){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }
    }
}