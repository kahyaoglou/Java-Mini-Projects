import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, factorial = 1;
        System.out.print("Enter the number for which you want the factorial to be calculated: ");
        num = input.nextInt();

        for (int i = 1; i<=num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println(num +".Factorial: " + factorial);
    }
}