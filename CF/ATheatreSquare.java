import java.util.Scanner;

public class ATheatreSquare {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long length = Math.ceilDiv(n, a);
        long width = Math.ceilDiv(m, a);
        System.out.println(length*width);
    }
}