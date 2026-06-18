import java.util.Scanner;

public class BComparisonString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();
            int l = 0;

            int x = 0;
            int y = 0;

            for(int i = 0; i < n; i++){

                if(s.charAt(i) == '>'){
                    x++;
                    y=0;
                }else if(s.charAt(i) == '<'){
                    y++;
                    x=0;
                }
                if(x>l && x> y){
                    l=x;
                }
                if(y>l && y>x){
                    l=y;
                }

            }
            System.out.println(l+1);

        }
    }
}