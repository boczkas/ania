package lekcja10;

public class Main {
    public static void main(String[] args) {
//        1. Zalety hermetyzacji
//        Obywatel marys = new Obywatel("Marys");

//        Czy chcielibyśmy żeby można teraz było zrobić coś takiego:
//        marys.name = "Staszek";

//        Ale takiego coś już chcemy mieć
//        marys.getName();

//        Co z pocketMoney, przecież to chcemy zmieniać?
//        Czy nie lepiej mieć publiczne pole?
//        Co z błędami?

//        isSuspended - chcemy zmieniać i odczytywać. Czy wtedy publiczne pole?
//        Co ze zmianą implementacji?
//        System.out.println(marys.getIsSuspended());

//        2. Przywileje klasowe
//        Każda metoda ma dostęp do wszystkich składowych obiektu klasy
//        showPocketMoney(). this.getName() -> this.name

//        3. Metody prywatne
//        Dobrą praktyką jest tworzenie pól prywatnych w klasie, ale co z metodami?
//        Czasami się ich używa - stworzymy increasePocketMoneyIfNotExceedLimit(100, 2000);
//        To że metoda jest prywatna daje nam pewność, że nie jest używana poza klasą i jej zmiana,
//        a nawet usunięcie nie spowoduje błędów kompilacji
//        marys.increasePocketMoneyIfNotExceedLimit(100, 2000);

//        4. Stałe jako pola klasy
//        słówko final. U nas np. name . Pola z final MUSZĄ zostać zainicjalizowane przed zakończeniem działania
//        konstruktora. Czyli albo w konstruktorze, albo od razu przy deklaracji. Zagadka - co z favouriteFood?

//        5. Pola statyczne
//        każdy obiekt ma swoje kopie zmiennych
//        inaczej jest w przypadku zmiennych ze static - pola klasowe (nie obiektowe)
//        ammountOfPeople

//        Obywatel nika = new Obywatel("Nikoletta", 1,1,1,0);
//        System.out.println(Obywatel.getAmountOfPeople());
//
//        Obywatel ania = new Obywatel("Ania");
//        System.out.println(Obywatel.getAmountOfPeople());
//        System.out.println(nika.getAmountOfPeople());
//
//        Obywatel tosia = new Obywatel("Tosia");
//        System.out.println(Obywatel.getAmountOfPeople());
//        System.out.println(nika.getAmountOfPeople());
//        System.out.println(ania.getAmountOfPeople());

    }
}
