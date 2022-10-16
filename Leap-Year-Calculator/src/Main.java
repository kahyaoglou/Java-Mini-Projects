import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Please Enter the Year: ");
        year = input.nextInt();

        if(year%100==0){
            if(year % 400 == 0) {
                System.out.println(year + " is a Leap Year!");
            }
            else{
                System.out.println(year + " is not a Leap Year");
            }
        }
        else if (year%4 == 0){
            System.out.println(year + " is a Leap Year!");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}