import java.util.Scanner;

public class ALuckyDivision {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 777};
        boolean possible = false;
        for(int x : arr){
            if( n%x ==0){
                possible = true;
                break;
            }
        }
        if(!possible){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}