import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        int gcd = 1, lcm = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();

        int i = 1;
        while(i<num1)
        {
            if((num1 % i == 0) && (num2 % i == 0))
            {
                System.out.print(i + ", ");
                gcd = i;
            }
            i++;
        }
        System.out.println();
        System.out.println(num1 + " ve " + num2 + "'nin EBOB'u (GCD): " + gcd);

        while(i <= num1*num2)
        {
            if((i % num1 == 0) && (i % num2 == 0))
            {
                System.out.print(i + ", ");
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println();
        System.out.println(num1 + " ve " + num2 + "'nin EKOK'u (LCM): " + lcm);
    }
}