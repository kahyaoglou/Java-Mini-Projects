import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, option;
        System.out.print("User Name: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Log in...");
        }
        else {
            System.out.println("Incorrect user name or password");
            System.out.println("Do you want a reset the password? Yes or No?");
            option = input.nextLine();
            if(option.equals("Yes")){
                System.out.print("Please enter your new Password: ");
                password = input.nextLine();
                if(password.equals("java123")){
                    System.out.println("Password not updated. Please try different password from the previous one..");
                }
                else {
                    System.out.println("Password updated!");
                }
            }
            else if (option.equals("No")){
                System.out.println("Successfully logged out");
            }
            else{
                System.out.println("Wrong way! Logging out.");
            }
        }
    }
}