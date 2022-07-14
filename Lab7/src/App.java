import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String url = "jdbc:mysql://127.0.0.1:3306/testdb";
        String user = "root";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();

        while(true){
            System.out.println("Select an option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println(" 1) Print all employee");
            System.out.println(" 2) Add an employee");
            System.out.println(" 3) quit");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            int input = s.nextInt();

            if (input == 1) {
                new App().showEmployee(statement);
            } else if(input ==2) {
                
                new App().insertEmployee(s, conn);
            } else {
                break;
            }

    }
        }


        public void showEmployee(Statement statement) {
            ResultSet resultSet;
            try {
                resultSet = statement.executeQuery("SELECT * FROM employees");
                System.out.println("================================================");
                while (resultSet.next()) {
    
                    System.out.println(resultSet.getString("name") + " - " + resultSet.getString("department") + " ($"
                            + resultSet.getString("salary") + ")");
                    System.out.println("- - - - - - - - - - - - - - - - - - -");
                }
                System.out.println("================================================");
            } catch (SQLException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }
           
        }
        
    
        public void insertEmployee(Scanner s , Connection conn) {
            
            try {
                System.out.print("Please enter a name: ");
                String name = s.next();
                System.out.printf("Please enter %s's department: ", name);
                String department = s.next();
                System.out.printf("Please enter %s's salary: ", name);
                int salary = s.nextInt();

                String qry = "INSERT INTO employees (name,department,salary) VALUES (?,?,?);";
                PreparedStatement pstatement;
                    pstatement = conn.prepareStatement(qry);
                    pstatement.setString(1, name);
                    pstatement.setString(2, department);
                    pstatement.setInt(3, salary);
                    pstatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
    }

}
