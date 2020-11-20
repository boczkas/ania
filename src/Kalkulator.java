import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dwie liczby na których chesz wykonać działanie");
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Podaj jakie działanie chcesz przeprowadzić ");
        String znak = in.next();


        if (znak.equals("+")) {
            double wynik = a + b;
            System.out.println(a + " " + znak + " " + b + " = " + wynik);
        }
        else if (znak.equals("-")) {
            double wynik = a - b;
            System.out.println(a + " " + znak + " " + b + " = " + wynik);
        }
        else if (znak.equals("*")) {
            double wynik = a * b;
            System.out.println(a + " " + znak + " " + b + " = " + wynik);
        }
        else if (znak.equals("/")) {
            double wynik = a / b;
            System.out.println(a + " " + znak + " " + b + " = " + wynik);
        }
    }
}
