import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilo;
        double boy, kitleEndeks;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        kitleEndeks = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz: "+kitleEndeks);
    }
}