import java.util.Scanner;

public class AChatRoom {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String w = "hello";
        int i = 0;
        for(int x = 0; x < s.length(); x++){
            if(s.charAt(x)==w.charAt(i)){
                i++;
            }
            if(i == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        
        
    }
}