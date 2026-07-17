import java.util.Scanner;

public class DOddQueries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            int[] pref = new int[n+1];
            int totalSum = 0;
            for(int i = 1; i<n+1; i++){
                totalSum += sc.nextInt();
                pref[i] = totalSum;
            }

            for(int i = 0; i < q; i++){

                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                int oldSum = pref[r]-pref[l-1];
                int newSum = k*(r-l+1);

                int finalSum = totalSum - oldSum + newSum;

                if(finalSum%2==0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }

                

            }

        }
    }
}