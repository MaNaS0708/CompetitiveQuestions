import java.util.Scanner;

public class DDeletiveEditing {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-- > 0){

            String s = sc.next();
            String t = sc.next();

            char[] ft = new char[26];

            for(int i = 0; i < t.length(); i++){
                int in = t.charAt(i) - 'A';
                ft[in]++;
            }
            StringBuilder fstring = new StringBuilder();

            for(int i = s.length()-1; i >=0; i--){
                if(ft[s.charAt(i) - 'A']>0){
                    ft[s.charAt(i) - 'A']--;
                    fstring.append(s.charAt(i));
                }
            }

            fstring.reverse();

            if(fstring.toString().equals(t)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }        
    }
}