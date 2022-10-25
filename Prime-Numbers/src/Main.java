import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int control=0, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        for(int i=2; i<=number; i++)
        {
            control = 0;
            for(int j=2; j<i; j++)
            {
                if(i % j == 0)
                {
                    control = i;
                    break;
                }
            }
            if(control == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}