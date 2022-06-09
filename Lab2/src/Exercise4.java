import java.util.Scanner;

public class  Exercise4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("How many integers will be added: ");
        int NumofAdd = s.nextInt();
        int sum = 0;
        for (int i = 0; i < NumofAdd; i++) {
            System.out.print("Enter an integer: ");
            sum += s.nextInt();
        }
        s.close();
        System.out.printf("The sum is %d%n",sum);

    }
}
