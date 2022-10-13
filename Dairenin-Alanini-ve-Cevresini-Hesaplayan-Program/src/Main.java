import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double alan, cevre, aciAlan, pi = 3.14; //Sabit(Const)
        int a, r;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        aciAlan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.print(a + " derece merkez açılı dairenin alanı: " + aciAlan);
    }
}