import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;

        while(right > 0)
        {
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz: ");
            password = input.nextLine();
            if(userName.equals("furkaneralp") && password.equals("123456"))
            {
                do {
                    System.out.println("Merhaba, Kahyaoglou Bankasına Hoşgeldiniz!");
                    System.out.println("" +
                            "1- Para Yatırma\n"+
                            "2- Para Çekme\n"+
                            "3- Bakiye Sorgula\n"+
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select)
                    {
                        case 1:
                            System.out.print("Ne kadar yatırmak istiyorsunuz?: ");
                            int price1 = input.nextInt();
                            balance = balance + price1;
                            break;

                        case 2:
                            System.out.print("Ne kadar para çekmek istiyorsunuz?: ");
                            int price2 = input.nextInt();
                            if (price2 > balance)
                            {
                                System.out.println("Bakiye yetersiz.");
                            }
                            else
                            {
                                balance = balance - price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " Türk Lirası.");
                            break;
                        case 4:
                            System.out.println("Başarıyla çıkış yapıldı.");
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
                            break;
                    }
                }
                while(select != 4);
                break;
            }
            else
            {
                right--;
                System.out.println("Kullanıcı adınız veya şifreniz yanlış. Lütfen Tekrar Deneyiniz.");
                if(right==0)
                {
                    System.out.println("Hesabınıza bloke konulmuştur. Lütfen şubenizle iletişime geçiniz.");
                }
                else
                {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}