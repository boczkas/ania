import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
    public static void main(String[] args) {
        {
            // jak wylosować numer w zakresie 0 - 1000
            // https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000);

            // jak wczytać liczbę z konsoli
            // https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
            Scanner in = new Scanner(System.in);
            int guessedNumber = in.nextInt();

            System.out.println("Random: " + randomNumber);
            while (guessedNumber != randomNumber) {
                System.out.println("Wpisales: " + guessedNumber);
                if (guessedNumber < randomNumber) {
                    System.out.println("Mniejszy niz losowy");
                } else {
                    System.out.println("Wiekszy niz losowy");
                }
                guessedNumber = in.nextInt();
            }
            System.out.println("Zgadles! Losowa liczba to: " + randomNumber);
        }
    }
}
