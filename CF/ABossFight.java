import java.util.Scanner;

public class ABossFight {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] f = new int[1001];
            int fm = 0;
            int x = 0;
            int total = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                total += arr[i];
                f[arr[i]]++;
                if(f[arr[i]]>fm){
                    fm = f[arr[i]];
                    x = arr[i];
                }
            }

            if(fm <= (n+1)/2){
                System.out.println(total);
            }else{
                long nonx = 0;
                for(int i = 0; i < n; i++){
                    if(arr[i]!=x){
                        nonx+=arr[i];
                    }
                }
                long sum = nonx + (long) (n-fm+2)*x;
                System.out.println(sum);
            }


            
        }
    }
}