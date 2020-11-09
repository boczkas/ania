import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Wpisz liczbę z pozycją w ciągu Fibonacciego");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int n0 = 0;
        int n1 = 1;
        int n2;
        int i;

        for(i=2; i<1000; ++i) {
            n2=n0+n1;
            n0=n1;
            n1=n2;

            if (i == x){
                System.out.println(n2);
            }
        }

    }
}




