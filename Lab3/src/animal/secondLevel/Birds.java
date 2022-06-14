package animal.secondLevel;

import animal.topLevel.Animal;

public class Birds extends Animal {
    private String with;
    private String ability;

    public Birds() {
        super();
        this.with = "feathers";
        this.ability = "fly";
        this.setAnimalType("Birds");
        this.setBloodType("O");
        this.setHeight(55);
        this.setWeight(20);
    }

    public Birds(int height, int weight, String animalType, String bloodType, String with, String ability) {
        super(height, weight, animalType, bloodType);
        this.with = with;
        this.ability = ability;
    }

    public String getWith() {
        return with;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ability=" + ability + ", with=" + with);
    }
    
}
