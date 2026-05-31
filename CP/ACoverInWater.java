import java.util.Scanner;

public class ACoverInWater{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            String cell = sc.next();

            int totaldots = 0;

            if(cell.contains("...")){

                System.out.println(2);

            } else {

                for(int i = 0; i < n; i++){

                    if (cell.charAt(i) == '.'){

                        totaldots++;

                    }

                }

                System.out.println(totaldots);

            }

        }

    }

}