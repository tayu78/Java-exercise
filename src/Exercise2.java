import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        int money, cents, dollers;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input the cents: ");
        money = input.nextInt();
        input.close();
        cents = money % 100;
        dollers = money / 100;
        System.out.printf("The value is %d dollers and %d cents.", dollers, cents);
    }
        
    }

