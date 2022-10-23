import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        int a,b;
        for(a = 1; a <= n; a++){
            for (b = 0; b <= (a)-1; b++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*(n-a)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}