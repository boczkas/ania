import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Podaj swój wiek");

        Scanner in = new Scanner(System.in);
        int h = in.nextInt();


        System.out.println("           **     **");
        System.out.println("         *   *   *   *");
        System.out.println("           *  **   *");
        System.out.println("               *");


        for (int i = 0; i < h/3 ; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("WSZYSTKIEGO NAJLEPSZEGO Z OKAZJI " + h + " URODZIN !!!!");
    }
}

        /*}

            System.out.print(t);
        }
        System.out.println();

         */
