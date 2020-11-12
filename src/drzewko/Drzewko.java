package drzewko;

import java.util.Scanner;

public class Drzewko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak wysokie ma byc drzewko?");

        int wysokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
