import java.util.Scanner;

public class CiagFibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int i = 0;


        /*if (i == 0) {                    liczba pierwsza >1 więc tych wartości nie wypisuję
            System.out.println(n0);
        }
        if (i == 1) {
            System.out.println(n1);
        }
        */
        for(i=2; n2<x; ++i) {
            n2=n0+n1;
            n0=n1;
            n1=n2;
            System.out.println(n2);
        }


    }
}