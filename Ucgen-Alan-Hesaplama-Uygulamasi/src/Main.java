import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, u;
        double alan;
        System.out.print("Üçgenin ilk kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        b = input.nextInt();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.print("Alan: "+alan);
    }
}