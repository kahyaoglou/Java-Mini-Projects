/* progBir sayının basamak sayılarının toplamını hesaplayan program

 Örnek : 1643 = 1 + 6 + 4 + 3 = 14       */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        int basamakNumber = 0; //Basamak sayısı.
        int tempNumber = number; //Geçici sayı.
        int basamakValue; //Basamak değeri.
        int result = 0;

        while(tempNumber != 0)
        {
            tempNumber = tempNumber / 10;
            basamakNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0)
         {
             basamakValue = tempNumber % 10;

             result = result + basamakValue;
             tempNumber = tempNumber / 10;
         }

        System.out.println("Basamak toplamları: " + result);

    }
}