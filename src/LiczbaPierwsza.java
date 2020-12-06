import java.util.Scanner;

public class LiczbaPierwsza {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę większą od 1. Sprawdzimy czy podana liczba jest liczbą pierwszą.");

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double liczba;
        double dzielnik = 2;
        double resztaZDzielenia;

        /*if (x == 2) {
            System.out.println("Podana liczba JEST liczbą pierwszą ");
            System.out.println("i NALEŻY do ciągu Fibonacciego.");
        }
         */

        for (liczba = x; dzielnik > 1 && dzielnik < x; dzielnik++) {
            resztaZDzielenia = liczba % dzielnik;

             if (resztaZDzielenia == 0) {
                System.out.println("Podana liczba NIE JEST liczbą pierwszą");
                return;
            }
        }
        System.out.println("Podana liczba JEST liczbą pierwszą");

        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int i = 0;

        for(i=2; n2<x; ++i) {
            n2=n0+n1;
            n0=n1;
            n1=n2;
            //System.out.println(n2);
            if (x == n2) {
                System.out.println("i NALEŻY do ciągu Fibonacciego");
                return;
            }
        }
        System.out.println("i NIE NALEŻY do ciągu Fibonacciego");
    }
}
