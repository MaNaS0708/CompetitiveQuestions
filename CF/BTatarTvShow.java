import java.util.Scanner;
public class BTatarTvShow {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] one = new int[k];

            for(int i = 0; i<n; i++){
                if(s.charAt(i)=='1'){
                    one[i%k]++;
                }
            }

            boolean poss = true;
            for(int i =0; i<k; i++){
                if(one[i]%2!=0){
                    poss = false;
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
}