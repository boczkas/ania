package lekcja12.villager;

public class NiezwyklyVillager extends Villager {
    String skill;
    public NiezwyklyVillager(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Siema jestem " + name + " mój skill to: " + skill);
    }
}
