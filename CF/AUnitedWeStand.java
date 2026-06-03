import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AUnitedWeStand{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){

            int n = sc.nextInt();

            int[] a = new int[n];

            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++){

                a[i] = sc.nextInt();

            }

            int max = Arrays.stream(a).max().getAsInt();

            for (int elements : a){

                if(elements==max){

                    c.add(elements);

                }else{

                    b.add(elements);

                }

            }

            if(b.size()==0){
                System.out.print(-1);
            }else{
                System.out.println(b.size() + " " + c.size());
                for(int x : b){
                    System.out.print(x + " ");
                }
                for(int x : c){
                    System.out.print(x + " ");
                }
            }
            System.out.println();

        }

    }
}