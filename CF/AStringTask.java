import java.util.Scanner;

public class AStringTask {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        String vov = "aeiouyYAEIOU";
        StringBuilder op = new StringBuilder();
        for(int i = 0; i < len; i++){
            char x = s.charAt(i);
            if(vov.indexOf(x)== -1){
                if(Character.isUpperCase(x)){
                    op.append(".");
                    op.append(Character.toLowerCase(x));
                }else{
                    op.append(".");
                    op.append(x);
                }
            }
        }
        System.out.println(op);
    }
}