package animal.lowerLevel;

import animal.secondLevel.Birds;

public class Eagle extends Birds {

    public Eagle() {
        super();
    }

    public Eagle(int height, int weight, String animalType, String bloodType, String with, String ability) {
        super(height, weight, animalType, bloodType, with, ability);
    }

    @Override
    public void showInfo() {
        System.out.println("This is Eagle");
    }
}

