package caluclator;

public class Caluclator {

    private double num1, num2;

    public Caluclator(double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double substract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        // if (num2 == 0)
        //     return false;
        return num1 / num2;
    }
}

