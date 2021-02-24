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

    //    ChoryVillager ktoJestMoimKuplem(ChoryVillager villager) {
//        System.out.println("Moim kumplem jest: " + villager.getName());
//        return villager;
//    }

//    @Override
//    ChoryVillager ktoJestMoimKuplem(ChoryVillager villager) {
//        System.out.println("Moim kumplem jest: " + villager.getName());
//        return villager;
//    }
}
