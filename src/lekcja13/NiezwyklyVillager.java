package lekcja13;

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

    public String getSkill() {
        return skill;
    }

    public void dajPrezent(String nazwa) {
        System.out.println("Dzięki za " + nazwa);
    }

    public void dajPrezent(String nazwa, int ilosc) {
        System.out.println("Dzięki za " + nazwa + "w ilosci " + ilosc);
    }

    public String getDescriptiveName() {
        return "Siema jestem niezwyklym mieszkancem " + getName();
    }

    ChoryVillager ktoJestMoimKuplem(ChoryVillager villager) {
        System.out.println("Moim kumplem jest: " + villager.getName());
        return villager;
    }
}
