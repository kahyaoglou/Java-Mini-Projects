/*Kullanıcıların manavdan almış oldukları
  ürünlerin kilogram değerlerine göre toplam tutarını
  ekrana yazdıran program.

  Meyveler ve KG Fiyatları

  Armut : 2,14 TL
  Elma : 3,67 TL
  Domates : 1,11 TL
  Muz: 0,95 TL
  Patlıcan : 5,00 TL */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00;
        double a,e,d,m,p,toplam;

        System.out.print("Armut Kaç Kilo? : ");
        a = input.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        e = input.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        d = input.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        m = input.nextDouble();
        System.out.print("Patlican Kaç Kilo? : ");
        p = input.nextDouble();

        toplam = (armut*a)+(elma*e)+(domates*d)+(patlican*p)+(muz*m);
        System.out.print("Toplam Tutar: " + toplam);
    }
}