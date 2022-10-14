 import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1, num2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İşlem Yapılacak İlk Sayıyı Giriniz: ");
        num1 = input.nextInt();
        System.out.print("İşlem Yapılacak İkinci Sayıyı Giriniz: ");
        num2 = input.nextInt();

        System.out.println("Hangi İşlem Yapılacak? Numarasını Seçiniz...");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplama Sonucu: " + (num1+num2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu: " + (num1-num2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu: " + (num1*num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Bölme Sonucu: " + (num1/num2));
                    break;
                }
                else {
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                    break;
                }
            default:
                System.out.println("Hatalı Bir Seçim Yaptınız! Lütfen Tekrar Deneyiniz.");
        }
    }
}