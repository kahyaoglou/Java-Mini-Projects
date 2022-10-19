/* Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, power, finalExponent = 1 ;

        System.out.print("Please enter the base: ");
        base = input.nextInt();
        System.out.print("Please enter the power (exponent): ");
        power = input.nextInt();

        for (int i = 1; i <= power; i++)
        {
            finalExponent *= base;
        }

        System.out.print(base + " to the " + power + " power = " + finalExponent);
    }
}
