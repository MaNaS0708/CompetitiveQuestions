import java.util.Scanner;
import java.util.regex.Pattern;

public class ADubstep {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String y = "WUB";

        String[] result = s.split(Pattern.quote(y));

        for(String x : result){
            if(!x.isEmpty()){
                System.out.print(x+" ");
            }
        }
        System.out.println();

    }
}