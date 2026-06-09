import java.util.HashSet;
import java.util.Scanner;

public class AForked{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            long a = sc.nextLong();
            long b = sc.nextLong();
            long xk = sc.nextLong();
            long yk = sc.nextLong();
            long xq = sc.nextLong();
            long yq = sc.nextLong();

            long[] sa = {a , a , -a , -a, b , b, -b, -b};
            long[] sb = {b , -b, b , -b, a, -a, a, -a};

            HashSet<String> kinghits = new HashSet<>();
            HashSet<String> queeshits = new HashSet<>();

            for(int i = 0; i < 8; i++){

                long hitxk = xk + sa[i];
                long hityk = yk + sb[i];
                String posx = hitxk + " " + hityk;
                kinghits.add(posx);

                long hitxq = xq + sa[i];
                long hityq = yq + sb[i];
                String posy = hitxq + " " + hityq;
                queeshits.add(posy);

            }

            int forkPos = 0;

            for(String element : kinghits){

                if(queeshits.contains(element)){
                    forkPos++;
                }

            }

            System.out.println(forkPos);

        }

    }

}