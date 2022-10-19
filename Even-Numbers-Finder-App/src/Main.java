import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,i;
        System.out.print("Please enter the number: ");
        sayi = input.nextInt();

        for (i=1 ; i <= sayi; i++)
        {
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

    }
}