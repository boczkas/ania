import java.util.Scanner;

public class Wielomian {
    public static void main(String[] args) {

        System.out.println("Aby wyznaczyć miejsca zerowe, podaj współczyniki a,b oraz c");

        //Deklarujemy a,b,c
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        //Liczymy deltę:
        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0) {
            System.out.println("Funkcja kwadratowa nie ma miejsc zerowych.");
        }

        else if (delta == 0) {
            System.out.println("Funkcja kwadratowa ma jedno miejsce zerowe x0:");
            double x0 = (-b/(2*a));
            System.out.println("x0 = " + x0);

        }

        else {
            System.out.println("Funkcja kwadratowa ma dwa miejsca zerowe x1 i x2:");
            double x1 = ((-b - Math.sqrt(delta))/(2*a));
            double x2 = ((-b + Math.sqrt(delta))/(2*a));
            System.out.println("x1 = " + x1 + ", a x2 = " + x2);
        }
    }
}
