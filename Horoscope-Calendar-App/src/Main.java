//Burç bulan program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String burc = ""; //burc şu an boş bir değer

        System.out.print("Doğduğunuz Ay? : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün? : ");
        day = input.nextInt();

        if (month == 1){
            if(0 < day && day < 31){
                if(day>21){
                    burc = "Kova Burcu";
                }
                else{
                    burc = "Oğlak Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 2){
            if(0 < day && day < 28){
                if(day>19){
                    burc = "Balık Burcu";
                }
                else{
                    burc = "Kova Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 3){
            if(0 < day && day < 31){
                if(day>20){
                    burc = "Koç Burcu";
                }
                else{
                    burc = "Balık Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 4){
            if(0 < day && day < 30){
                if(day>20){
                    burc = "Boğa Burcu";
                }
                else{
                    burc = "Koç Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 5){
            if(0 < day && day < 31){
                if(day>21){
                    burc = "İkizler Burcu";
                }
                else{
                    burc = "Boğa Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 6){
            if(0 < day && day < 30){
                if(day>22){
                    burc = "Yengeç Burcu";
                }
                else{
                    burc = "İkizler Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 7){
            if(0 < day && day < 31){
                if(day>22){
                    burc = "Aslan Burcu";
                }
                else{
                    burc = "Yengeç Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 8){
            if(0 < day && day < 31){
                if(day>22){
                    burc = "Başak Burcu";
                }
                else{
                    burc = "Aslan Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 9){
            if(0 < day && day < 30){
                if(day>22){
                    burc = "Terazi Burcu";
                }
                else{
                    burc = "Başak Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 10){
            if(0 < day && day < 31){
                if(day>22){
                    burc = "Akrep Burcu";
                }
                else{
                    burc = "Terazi Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 11){
            if(0 < day && day < 30){
                if(day>21){
                    burc = "Yay Burcu";
                }
                else{
                    burc = "Akrep Burcu";
                }
            }
            else{
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        if (month == 1) {
            if (0 < day && day < 31) {
                if (day > 21) {
                    burc = "Oğlak Burcu";
                } else {
                    burc = "Yay Burcu";
                }
            } else {
                System.out.println("Hatalı bir gün girdiniz. Lütfen tekrar deneyin.");
            }
        }
        System.out.println(burc);
    }
}
