/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını
ekrana yazdıran programı yazalım..

 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde
   yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, ucret, acilis = 10;

        System.out.print("Yolcu kaç kilometre yol aldı: ");
        km = input.nextDouble();
        ucret = (2.20 * km) + 10 ;

        ucret = ucret < 20 ? 20:ucret;

        System.out.print("Toplam Ücret: " +ucret);
    }
}