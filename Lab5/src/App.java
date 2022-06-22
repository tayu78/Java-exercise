import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new App().Lab3Q1();
        System.out.println("************************");
        new App().Lab3Q2();
        System.out.println("************************");
        new App().Lab3Q3();

    }

    public void Lab3Q1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(50) + 1);
            System.out.println(arrayList.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the number: ");
        int userInput = scanner.nextInt();
        if (arrayList.indexOf(userInput) == -1)
            System.out.println("the number " + userInput + "  is not in the list ");
        else
            System.out.println("the number " + userInput + "  is in the list of index " + arrayList.indexOf(userInput));
        scanner.close();

    }

    public void Lab3Q2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(50) + 1);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.set(arrayList2.size() - 1, -5);
        System.out.println("arrayList: " + arrayList);
        System.out.println("arrayList2: " + arrayList2);
    }

    public void Lab3Q3() {
        ArrayList<Car> cars = new ArrayList<>();
        Car crv = new Car("Honda", "CR-V", 2000);
        Car serena = new Car("Nissan", "SERENA", 1997);
        Car corolla = new Car("Toyota", "Corolla", 2022);
        cars.addAll(Arrays.asList(crv, serena, corolla));
        cars.sort(null);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
 
class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }

}

