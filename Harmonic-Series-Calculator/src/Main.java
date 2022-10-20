/* Java ile girilen sayının harmonik serisini bulan program */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0;
        System.out.print("Please enter the number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            result = result + (1.0/i);
        }

        System.out.println("Result: " + result);
    }
}