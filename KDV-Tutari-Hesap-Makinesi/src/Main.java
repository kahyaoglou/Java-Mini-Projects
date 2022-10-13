import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar <= 1000) ? 0.18 : 0.08;
        kdvTutar = kdvOran * tutar;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat: "+tutar);
        System.out.println("KDV Oranı: " +kdvOran);
        System.out.println("KDV Fiyatı: "+kdvTutar);
        System.out.println("KDV Dahil Toplam Fiyat: " +kdvliTutar);
    }
}