import java.util.Scanner;

public class  Exercise2 {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Input the N: ");
        int N = s.nextInt();
        s.close();
        int total = 0;
        for (int i = 1; i <= N; i++)
            total += i;
        System.out.printf("The sum of 1 to %d is %d%n",N,total);
    }
}
