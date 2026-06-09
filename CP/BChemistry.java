import java.util.Scanner;

public class BChemistry{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];

            for(int i = 0; i < n; i++){

                char c = s.charAt(i);
                freq[c-'a']++;

            }

            int oddcount = 0;
            for(int i = 0; i < 26; i++){
                if(freq[i]%2 != 0){
                    oddcount++;
                }
            }

            if((oddcount -1)<=k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

}