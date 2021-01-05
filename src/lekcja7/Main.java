package lekcja7;

public class Main {
//    1. Programowanie proceduralne vs strukturalne
//      To co robiliśmy do tej pory było strukturalne.
//      Mieliśmy dane na wejściu -> wymyślaliśmy algorytm -> dane na wyjściu
//    Tak się programowało jakieś 30 lat temu ;)

//    Pomyślmy jak zbudować program strukturalny obsługujący taką stronkę:
//    https://www.onet.pl/
//    Trochę linii do obsługi każdej ikonki, przycisku, wyświetlenia by było

//    Teraz podchodzi się do sprawy inaczej, a mianowicie stara się opisać dziedzinę problemu za pomocą obiektów i klas

//    2. Co to jest klasa?
//    Jest to szablon - pokazówka
//    Konstruując obiekt tworzymy egzemplarz (instancję) danej klasy
//    Biblioteka Javy ma mnóstwo swoich klas wbudowanych do obsługi dat, tekstu, kolekcji danych, ale nadal
//    konieczna jest kostrukcja własnych klas dostosowanych do dziedziny problemu, który rozwiązujemy

//    3. Hermetyzacja
//    Ukrywanie zbędnych dla użytkownika klasy szczegółów przez twórcę klasy.
//    Czy wiesz jak działa telewizor?

//    Czy wiesz jak działa odpalenie samochodu.

    public static void main(String[] args) throws InterruptedException {
        Samochod anioWoz = new Samochod();
        anioWoz.odpal();
    }

//    Hermetyzacja sprawia, że obiekty są dla nas czarną skrzynką

}
