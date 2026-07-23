import java.util.Arrays;
import java.util.Scanner;

public class APuzzles{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[m];
        for(int i = 0; i < m; i++){
            f[i]=sc.nextInt();
        }

        Arrays.sort(f);

        int minDiff = Integer.MAX_VALUE;
        int x = 0, y = n-1;
        while(y<m){
            int diff = f[y]-f[x];
            x++;
            y++;
            if(diff<minDiff){minDiff = diff;}
        }
        System.out.println(minDiff);
    }
}