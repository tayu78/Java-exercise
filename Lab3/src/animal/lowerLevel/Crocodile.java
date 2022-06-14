package animal.lowerLevel;

import animal.secondLevel.Reptile;

public class Crocodile extends Reptile {
    
    public Crocodile() {
        super();
        this.setEggType("Hard-shelled eggs");
    }


    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
    }

}
