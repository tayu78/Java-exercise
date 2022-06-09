import java.util.Scanner;

public class  Exercise1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Input the start: ");
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        System.out.print("Input the end: ");
        int end = s.nextInt();
        s.close();

        for (int i = start; i <= end; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println("");

        
        
    }
}
