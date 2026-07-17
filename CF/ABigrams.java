import java.util.Scanner;

public class ABigrams {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            
            int k = sc.nextInt();
            int[] c = new int[k];
            for (int i = 0; i < k; i++){
                c[i] = sc.nextInt();
            }
            boolean possible = false;
            int countTwo = 0;
            for(int i = 0; i < k; i++){
                if(c[i]>=3){
                    possible = true;
                    break;
                }else if(c[i]==2){
                    countTwo++;
                }
                if(countTwo==2){
                    possible = true;
                    break;
                }
            }
            if(!possible && countTwo < 2){
                System.out.println("NO");
            }else if(possible){
                System.out.println("YES");
            }
        }
    }
}