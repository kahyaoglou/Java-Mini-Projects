/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
 * derslerinin sınav puanlarını kullanıcıdan alan ve
 * ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, physic, chem, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        physic = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        chem = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        history = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        music = input.nextInt();

        double sonuc = (math+physic+chem+turkish+history+music)/6;
        System.out.println("Not Ortalamanız: "+ sonuc);

        String kosul =  sonuc > 60 ? "Sınıfı Geçti!" : "Sınıfta Kaldı :(";
        System.out.println(kosul);
    }
}