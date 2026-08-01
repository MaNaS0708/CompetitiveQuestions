import java.util.Scanner;

public class AYouDeleteIDelete {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            s = s.replaceFirst("0", "");
            s = s.replaceFirst("1", "");

            System.out.println(s);
        }
    }
}