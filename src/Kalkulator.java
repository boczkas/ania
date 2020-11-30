import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dwie liczby na których chesz wykonać działanie");
        double a = in.nextDouble();
        String aString = String.valueOf(a);
        double b = in.nextDouble();
        String bString = String.valueOf(b);

        System.out.println("Podaj jakie działanie chcesz przeprowadzić ");
        String operator = in.next();
        String q = "q";

        while (aString != q || bString != q || operator != q){
            if (operator.equals("+")) {
                double wynik = a + b;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("-")) {
                double wynik = a - b;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("*")) {
                double wynik = a * b;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            } else if (operator.equals("/")) {
                double wynik = a / b;
                System.out.println(a + " " + operator + " " + b + " = " + wynik);
            }
            a = in.nextDouble();
            b = in.nextDouble();
            operator = in.next();
        }

        while (aString == q || bString == q || operator == q){
            System.out.println("Koniec pracy kalkulatora");
            break;
        }
    }
}
