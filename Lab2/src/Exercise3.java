import java.util.Scanner;

public class  Exercise1 {
    public static void main(String[] args) throws Exception {
        int radious;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radious: ");
        radious = input.nextInt();
        input.close();
        area = Math.PI * radious * radious;
        System.out.printf("The radious is: %.15f",area);
    }
}
