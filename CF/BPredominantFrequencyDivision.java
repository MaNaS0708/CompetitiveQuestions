import java.util.Scanner;

public class BPredominantFrequencyDivision {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int i = 0;
            int c1 = 0;
            int cOth = 0;
            while(i<n){
                if(a[i]==1){
                    c1++;
                }else{
                    cOth++;
                }
                i++;
                if(c1 >= cOth){
                    break;
                }
            }
            if(c1 < cOth || i>=n){
                System.out.println("NO");
                continue;
            }

            int c12 = 0;
            int c3 = 0;

            while(i<n){

                if(a[i] == 3){
                    c3++;
                }else{
                    c12++;
                }
                i++;
                if(c12 >= c3){
                    break;
                }
            }
            if(c12 >= c3 && i<n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}