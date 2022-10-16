import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, discount, discountPrice = 0, finalPrice=0;
        int age, km, type;

        System.out.print("Mesafeyi Kilometre (km) Türünden Giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş):  ");
        type = input.nextInt();

        price = km * 0.10;

        if(age < 12){
            discount = price * 0.50;
            discountPrice = price - discount;
        }
        else if(12 <= age && age <= 24){
            discount = price * 0.10;
            discountPrice = price - discount;
        }
        else if(age>= 65){
            discount = price * 0.30;
            discountPrice = price - discount;
        }
        else if(age <= 30){
            System.out.println("Lütfen Doğru Yaş Aralığını Giriniz!");
        }
        else{
            discountPrice = price;
        }

        if (type == 1){
            finalPrice = discountPrice;
            System.out.println("Toplam Tutar: " + finalPrice);
        }
        else if (type == 2){
            finalPrice = (discountPrice - (discountPrice * 0.20)) *2;
            System.out.println("Toplam Tutar: " + finalPrice);
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}