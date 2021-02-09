package lekcja11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obywatel {

    private String name;
    private LocalDate dateOfBirth;
    private double pocketMoney;
    private boolean isSuspended;
    private List<String> favouriteFood;
    private static int amountOfPeople = 0;

    {
        amountOfPeople++;
    }

    public Obywatel(String name, int year, int month, int day, double pocketMoney) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.pocketMoney = pocketMoney;
        this.favouriteFood = new ArrayList<>();
//        amountOfPeople += 1;
    }

    public Obywatel(String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(1, 1, 1);
        this.pocketMoney = 0;
        this.favouriteFood = new ArrayList<>();
//        amountOfPeople += 1;
    }

    public Obywatel() {}

    public Obywatel(String name, LocalDate localDate) {
        this(name, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0);
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
        System.out.println(this.name + ": " + this.pocketMoney);
    }

    private void increasePocketMoney(int amount) {
        this.pocketMoney = this.pocketMoney + amount;
    }

    public void addFavouriteFood(String food) {

//        No to co z tym final?
        this.favouriteFood.add(food);

//        this.favouriteFood = new ArrayList<>();
    }

    public static int getAmountOfPeople() {
        return amountOfPeople;
    }

    public boolean getIsSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public void increasePocketMoneyIfNotExceedLimit(int amount, int limit) {
        if (this.pocketMoney + amount < limit) {
            increasePocketMoney(amount);
        }
    }
}
