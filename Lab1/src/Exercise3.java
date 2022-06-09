import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input the number: ");
        num = input.nextInt();

        input.close();
        for (int i = 1; i <= num; i++) {
            int multi = i * num;
            System.out.printf("%d × %d = %d ", num, i, multi);
        }
       
    }
        
    }

