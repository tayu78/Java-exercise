package animal.secondLevel;

import animal.topLevel.Animal;

public class Fish extends Animal {
    private String whereToLive;
    private String howToBreath;

    public Fish() {
        super();
        this.whereToLive = "in water";
        this.howToBreath = "gills";
        this.setAnimalType("Fish");
        this.setBloodType("AB");
        this.setHeight(20);
        this.setWeight(5);
    }

    public Fish(int height, int weight, String animalType, String bloodType, String whereToLive, String howToBreath) {
        super(height, weight, animalType, bloodType);
        this.whereToLive = whereToLive;
        this.howToBreath = howToBreath;
    }

    public String getWhereToLive() {
        return whereToLive;
    }

    public String getHowToBreath() {
        return howToBreath;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("howToBreath=" + howToBreath + ", whereToLive=" + whereToLive);
    }

}
