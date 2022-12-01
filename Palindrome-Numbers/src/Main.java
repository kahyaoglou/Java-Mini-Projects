import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(int number){
        int temp = number, lastNumber, reverseNumber = 0;
        while(temp != 0)
        {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }

        if(number == reverseNumber)
            return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
}