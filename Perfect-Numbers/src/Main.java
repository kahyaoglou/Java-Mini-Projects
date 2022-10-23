import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int perfectNum, i=1, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        perfectNum = input.nextInt();

        do {
            if (perfectNum % i == 0)
            {
                if (i != perfectNum)
                {
                    total += i;
                }
            }
            i++;
        }
        while(i <= perfectNum);
        if (total == perfectNum)
        {
            System.out.println(perfectNum + " is Perfect Number!");
        }
        else {
            System.out.println(perfectNum + " is not Perfect Number :(");
        }
    }
}