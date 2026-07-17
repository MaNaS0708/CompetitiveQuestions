import java.util.Scanner;

public class AMainakAndArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j<n; j++){
                a[j]=sc.nextInt();
            }
            int maxDiff = 0;

            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    maxDiff = Math.max(maxDiff, a[i] - a[0]);
                }
                if (i < n - 1) {
                    maxDiff = Math.max(maxDiff, a[n - 1] - a[i]);
                }
            }

            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[i + 1]);
            }

            System.out.println(maxDiff);
        
        }
    }
}