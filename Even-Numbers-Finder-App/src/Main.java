/*Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan program*/
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
/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program*/
/*Scanner input = new Scanner(System.in);
        int sayi, i, sayac = 0, toplam = 0, ortalama = 0;
        System.out.print("Please enter the number: ");
        sayi = input.nextInt();

        for (i = 1 ; i <= sayi; i++)
        {
            if (i % 3 == 0 && i % 4 == 0){
                sayac++;
                System.out.print(i + ", ");
                toplam += i;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama: " +ortalama);
        */
