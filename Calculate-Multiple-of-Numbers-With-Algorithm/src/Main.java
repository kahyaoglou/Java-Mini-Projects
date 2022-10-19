import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter the number: ");
        num = input.nextInt();

        for (int i = 1; i < num; i *= 4){
            System.out.println("Power of the Four: "+ i);
        }
        for (int k = 1; k < num; k*=5){
            System.out.println("Power of the Five: "+k);
        }
    }
}