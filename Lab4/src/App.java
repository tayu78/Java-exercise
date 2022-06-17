import java.util.Scanner;

import caluclator.Caluclator;

public class App {
    public static void main(String[] args) throws Exception {
        boolean wantToContinue = true;
        Scanner s = new Scanner(System.in);
        while (wantToContinue) {
            System.out.println("Please type the first number: ");
            double firstNum = s.nextDouble();
            System.out.println("Choose an operation: ");
            System.out.println(" > Type + for addition");
            System.out.println(" > Type - for substract");
            System.out.println(" > Type * for multiply");
            System.out.println(" > Type / for divide");
            String operator = s.next();
            System.out.println("Please type second number:");
            double secondNum = s.nextDouble();
            Caluclator caluclator = new Caluclator(firstNum, secondNum);

            switch (operator) {
                case "+":
                    System.out.println(caluclator.add());
                    break;
                case "-":
                    System.out.println(caluclator.substract());
                    break;
                case "*":
                    System.out.println(caluclator.multiply());
                    break;
                case "/":
                    if (secondNum == 0) {
                        System.out.println("cannot devide by zero");
                        break;
                    }
                    System.out.println(caluclator.divide());
                    break;
            }
            System.out.println("Do you want to continue or quit?");
            String continueOrQuit = s.next();
            wantToContinue = (continueOrQuit.equals("continue")) ? true : false;
        }
        s.close();
    }
}
