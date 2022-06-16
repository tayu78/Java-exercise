import java.util.Scanner;

import caluclator.Caluclator;

public class App {
    public static void main(String[] args) throws Exception {

        boolean wantToContinue = true;

        while (wantToContinue) {
            System.out.println("Please type the first number: ");
            Scanner s1 = new Scanner(System.in);
            double firstNum = s1.nextDouble();
            Scanner s2 = new Scanner(System.in);
            System.out.println("Choose an operation: ");
            System.out.println(" > Type + for addition");
            System.out.println(" > Type - for substract");
            System.out.println(" > Type * for multiply");
            System.out.println(" > Type / for divide");
            String operator = s2.nextLine();
            Scanner s3 = new Scanner(System.in);
            System.out.println("Please type second number:");
            double secondNum = s3.nextDouble();
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
            Scanner s4 = new Scanner(System.in);
            System.out.println("do you want to continue or quit?");
            String continueOrQuit = s4.nextLine();
            wantToContinue = (continueOrQuit.equals("continue")) ? true : false;
            if (!wantToContinue) {
                s1.close();
                s2.close();
                s3.close();
                s4.close();
            }
        }
    }
    

    
}
