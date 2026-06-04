import java.util.Scanner;

public class AWalkingMaster{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int steps = 0;

            if(b>d){
                System.out.println(-1);
                continue;
            }

            int move1 = d-b;

            int newA = a + move1;
            
            if(newA < c){
                System.out.println(-1);
            }else{
                int move2 = newA - c;

                System.out.println(move1 + move2);
            }
            
        }

    }

}