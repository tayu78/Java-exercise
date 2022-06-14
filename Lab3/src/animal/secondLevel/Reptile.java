package animal.secondLevel;

import animal.topLevel.Animal;

public class Reptile extends Animal {
    private String skinType;
    private String bone;
    private String eggType;

    public Reptile() {
        super();
        this.skinType = "Dry Skin";
        this.bone = "Backbone";
        this.eggType = "Soft-shelled";
    }

    public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getBone() {
        return bone;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public void showInfo() {
        System.out.println("This is Reptile");
    }

    

    


    
}
