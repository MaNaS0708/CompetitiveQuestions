import java.util.Scanner;

public class AGoalsOfVictory{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            int n = sc.nextInt();

            int total = 0;

            for (int i = 0; i < n-1; i++){

                total = total + sc.nextInt();

            }

            int goal = 0 - total;

            System.out.println(goal);

        }

    }

}