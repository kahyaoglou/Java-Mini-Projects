/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan
sayıları toplayıp ekrana basan program
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0;
        do {
            System.out.print("Please enter the number: ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0)
            {
                toplam += sayi;
            }
        }
        while(sayi % 2 == 0);
        System.out.println("Sum: "+toplam);
    }
}
/*
Java döngüler ile negatif bir değer girilene kadar
kullanıcıdan girişleri kabul eden ve girilen değerlerden
tek sayıları toplayıp ekrana basan program
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        do {
            System.out.print("Please enter the number: ");
            sayi = input.nextInt();
            if (sayi % 2 == 1)
            {
                toplam += sayi;
            }
        }
        while (sayi > 0);

        System.out.println("Sum of Odd Numbers: " + toplam);
      }
}

 */