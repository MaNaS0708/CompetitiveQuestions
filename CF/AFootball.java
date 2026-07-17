import java.util.Scanner;

public class AFootball {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String pl = sc.next();

        int n = pl.length();

        boolean isDang = false;

        int count = 1;

        for(int i = 1; i < n; i++){
            if(pl.charAt(i)==pl.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            if(count >= 7){
                isDang = true;
                break;
            }
        }

        if(!isDang){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}