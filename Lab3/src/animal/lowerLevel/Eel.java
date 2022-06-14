package animal.lowerLevel;

import animal.secondLevel.Fish;

public class Eel extends Fish {
    private String ability;

    public Eel() {
        super();
        this.ability = "Release electronic charge";
    }

    public Eel(int height, int weight, String animalType, String bloodType, String whereToLive, String howToBreath,
            String ability) {
        super(height, weight, animalType, bloodType, whereToLive, howToBreath);
        this.ability = ability;
    }


    
    public String getAbility() {
        return ability;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ability=" + ability);
    }

    

    

}
