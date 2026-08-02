import java.util.Scanner;

public class BNewYearSNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            
            int n = sc.nextInt();
            
            int rem = n%2020;
            int qt = n/2020;

            if(rem<=qt){
                System.out.println("YES");
            }else{System.out.println("NO");}
        }
    }
}