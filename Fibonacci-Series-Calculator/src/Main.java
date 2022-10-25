import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleman, first=0, second=1, third;
        System.out.print("Fibonacci serisi eleman sayısı kaç olsun?: ");
        eleman = input.nextInt();
        System.out.print(first+" "+second);

        for (int i = 2; i<eleman; i++)
        {
            third = first + second;
            System.out.print(" "+third);
            first = second;
            second = third;
        }
        System.out.println();
    }
}