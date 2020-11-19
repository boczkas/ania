import java.util.Scanner;

public class Trojkat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        double c;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
    }
}
