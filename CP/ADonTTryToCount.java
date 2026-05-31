import java.util.Scanner;

public class ADonTTryToCount{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0){

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            int ops = 0;

            boolean found = false;

            for (int i = 0; i <= 5; i++) {
                if (a.contains(b)) {
                    System.out.println(ops);
                    found = true;
                    break;
                }
                a = a.repeat(2);
                ops++;
            }

            if (!found){
                System.out.println(-1);
            }

        }

    }

}