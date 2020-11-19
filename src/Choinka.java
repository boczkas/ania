import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {

        System.out.println("Ile pięter ma mieć świąteczne drzewko?");

        Scanner in = new Scanner(System.in);
        int h = in.nextInt();

       // int i;
       // int j;


        String s = " ";
        String t = "*";

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(s);
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
}




