import java.util.HashMap;
import java.util.Scanner;

public class CMaximizeTheScore {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = 2*(sc.nextInt());

            int[] arr = new int[n];

            HashMap<Integer, Integer> firstoccurance = new HashMap<>();

            int maxGap = -1;

            for(int i = 0; i < n; i ++){

                arr[i] = sc.nextInt();
                if(!firstoccurance.containsKey(arr[i])){
                    firstoccurance.put(arr[i], i);
                }else{

                    int firstIndex = firstoccurance.get(arr[i]);
                    int gap = i-firstIndex;
                    if gap>maxgap
                }
            }

            



        }
    }
}