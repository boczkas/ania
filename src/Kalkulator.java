import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String q = "q";
        double wynik;

        String a = in.next();
        if (a.equals(q)) {
            System.out.println("Koniec pracy kalkulatora!");
            return;
        }
        String b = in.next();
        if (b.equals(q)) {
            System.out.println("Koniec pracy kalkulatora!");
            return;
        }
        String operator = in.next();
        if (operator.equals(q)) {
            System.out.println("Koniec pracy kalkulatora!");
            return;
        }

        /*if (a.equals(q) || b.equals(q) || operator.equals(q)) {
            System.out.println("Koniec pracy kalkulatora!");
            return;
        }
         */

        while (!a.equals(q) || !b.equals(q) || !operator.equals(q)) {
            double aDouble = Double.valueOf(a);
            double bDouble = Double.valueOf(b);

            if (operator.equals("+")) {
                wynik = aDouble + bDouble;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("-")) {
                wynik = aDouble - bDouble;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("*")) {
                wynik = aDouble * bDouble;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("/")) {
                wynik = aDouble / bDouble;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            }
            a = in.next();
            if (a.equals(q)) {
                System.out.println("Koniec pracy kalkulatora!");
                return;
            }

            b = in.next();
            if (b.equals(q)) {
                System.out.println("Koniec pracy kalkulatora!");
                return;
            }
            operator = in.next();
            if (operator.equals(q)) {
                System.out.println("Koniec pracy kalkulatora!");
                return;
            }
        }
    }
}



