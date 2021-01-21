package lekcja9;

import java.time.LocalDate;

public class Obywatel {

//    2. Czy nie łatwiej żeby były publiczne?
    private final String name;
    private final LocalDate dateOfBirth;
    private double pocketMoney;

//    1.
//    konstruktor ma taką nazwę jak klasa,
//    klasa może mieć więcej niż jeden konstruktor
//    nadaje polom klasy ich początkowe wartości
//    konstruktor może przyjmować zero bądź więcej parametrów
//    konstruktor nie zwraca wartości
//    da się go wywołać tylko za pomocą new
    public Obywatel(String name, int year, int month, int day, double pocketMoney) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.pocketMoney = pocketMoney;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(double pocketMoney) {
        this.pocketMoney = pocketMoney;
    }
}
