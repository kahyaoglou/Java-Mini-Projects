/*Java döngüler ile sayının armstrong sayı olup olmadığını bulan program

 Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407
 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
 */

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
        int basamakPower;

        //BASAMAK SAYISI BULMA!
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while(tempNumber != 0)
        {
            tempNumber = tempNumber / 10;
            basamakNumber++;
        }

        tempNumber = number;

        // SON BASAMAĞI BULMA
        // 2451 % 10 = 1
        // 245 % 10 = 5
        // 24 % 10 = 4
        // 4 & 10 = 2

        while (tempNumber != 0)
         {
             basamakValue = tempNumber % 10;
             basamakPower = 1;

             for (int i = 1; i <= basamakNumber; i++)
             {
                 basamakPower = basamakPower * basamakValue;
             }
             result = result + basamakPower;
             tempNumber = tempNumber / 10;
         }

        if (result == number)
        {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }
        else
        {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }

    }
}