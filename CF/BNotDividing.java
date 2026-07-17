import java.util.Scanner;

public class BNotDividing {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){

                a[i] = sc.nextInt();
                if(a[i]==1){
                    a[i]=a[i]+1;
                }
            }
            for(int i = 0; i < n-1; i++){
                if(a[i+1]%a[i]==0){
                    a[i+1]=a[i+1]+1;
                }
            }
            for(int element : a){

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}