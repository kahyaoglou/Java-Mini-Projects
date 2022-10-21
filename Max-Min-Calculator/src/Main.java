import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit, temp=1, max = 0,min = 0, sayi;
        System.out.print("Kaç Sayı Girilecek?: ");
        limit = input.nextInt();
        while(temp > 0)
        {
            temp = limit;
            for (int i = 1; i <=limit; i++)
            {
                System.out.print("Lütfen " +i+" . sayıyı giriniz: ");
                sayi = input.nextInt();
                temp--;

                if (i==1)
                {
                    min=sayi;
                    max=sayi;
                }
                else
                {
                    if (sayi>max)
                    {
                        max=sayi;
                    }
                    if (sayi<min)
                    {
                        min=sayi;
                    }
                }
            }
        }
        System.out.println("Girdiğiniz En Büyük Sayı: " + max);
        System.out.print("Girdiğiniz En Küçük Sayı: "+min);
    }
}