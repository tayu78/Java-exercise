import java.util.Scanner;

public class  Exercise3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.nextLine();
        s.close();
        for (int i = 1; i <= word.length(); i++) {
            System.out.printf(" %s", word);
        }
        System.out.println("");
        
       
    }
}
