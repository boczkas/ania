package lekcja4;

public class Main {
    public static void main(String[] args) {
//        1. Operatory bitowe

        // 1    - 0000 0001
        // 4    - 0000 0100
        // 15   - 0000 1111

        // & bitowy and

//        int liczba = 4;
//        liczba = 0b100;
//
//        System.out.println("liczba = " + liczba);
//        int wynik = liczba & 1;
//
//        System.out.println("liczba & 1 = " + wynik);
//
//        wynik = liczba & 15;
//        System.out.println("liczba & 15 = " + wynik);
//
//        // | bitowy or
//        wynik = liczba | 1;
//        System.out.println("liczba | 1 = " + wynik);
//
//        wynik = liczba | 15;
//        System.out.println("liczba | 15 = " + wynik);
//
//        // >> przesunięcie bitowe w prawo
//        wynik = 4 >> 1;
//        System.out.println("4 >> 1 = " + wynik);
//
//        // << przesunięcie bitowe w lewo
//        wynik = 4 << 1;
//        System.out.println("4 << 1 = " + wynik);

//        2. Priorytety operatorów
//        Jest cała tabelka:
//        https://introcs.cs.princeton.edu/java/11precedence/

//        3. Typ wyliczeniowy
//        Stworzyć dni tygodnia

//        4. Łańcuchy - String
        String powitanie = "Cześć";
        System.out.println(powitanie);

//        wyciąganie kawałka
        String kawalek = powitanie.substring(0, 3);
        System.out.println(kawalek);

//        składanie wielu stringów
        String nieLadne = "brzydkie";
        String wyrazenie = "slowo";

        String wiadomosc = nieLadne + wyrazenie;
        System.out.println(wiadomosc);

//        składanie stringa z nieStringiem
        int wiek = 18;
        String ania = "Ania";

        System.out.println(ania + " ma " + wiek + " lat ");

//        Znaki specjalne
//        System.out.println("Jej mąż nazywany był "Baryłem"");
//        System.out.println(" \tLubił platformy \n ale bardziej grać w gry");

//        Stringi są niezmienne
//        co tak na prawdę robi operator ==
    }
}
