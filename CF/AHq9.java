import java.util.Scanner;

public class AHq9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean poss = false;

        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == 'H' || x == 'Q' || x == '9'){
                poss = true;
                break;
            }
        }
        if(!poss){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}