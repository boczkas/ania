package lekcja10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obywatel {

    private final String name;
    private final LocalDate dateOfBirth;
    private double pocketMoney;
    String isSuspended;
    private final List<String> favouriteFood;
    private static int amountOfPeople = 0;

    public Obywatel(String name, int year, int month, int day, double pocketMoney) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.pocketMoney = pocketMoney;
        this.favouriteFood = new ArrayList<>();
        amountOfPeople += 1;
    }

    public Obywatel(String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(1, 1, 1);
        this.pocketMoney = 0;
        this.favouriteFood = new ArrayList<>();
        amountOfPeople += 1;
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

    public void showPocketMoney() {
        System.out.println(this.getName() + ": " + this.pocketMoney);
    }

    public void increasePocketMoney(int amount) {
        this.pocketMoney = this.pocketMoney + amount;
    }

    public void addFavouriteFood(String food) {

//        No to co z tym final?
        this.favouriteFood.add(food);

//        this.favouriteFood = new ArrayList<>()
    }

    public static int getAmountOfPeople() {
        return amountOfPeople;
    }
}
