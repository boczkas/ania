import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Wpisz liczbę z pozycją w ciągu Fibonacciego");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int i;

        if (x == 0) {
            System.out.println(n0);
        }

        if (x == 1) {
            System.out.println(n1);
        }

        for(i=2; i<=x; ++i) {
            n2=n0+n1;
            n0=n1;
            n1=n2;

        }
        System.out.println(n2);
    }
}




