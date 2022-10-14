import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physic, turkish, chem, music,sum=0, numberOfLesson=0;

        System.out.print("Math Score: ");
        math = input.nextInt();
        if(math<0 || math >100){
            math = 0;
        }
        else {
            sum+=math;
            numberOfLesson++;
        }

        System.out.print("Physic Score: ");
        physic = input.nextInt();
        if(physic<0 || physic >100){
            physic = 0;
        }
        else {
            sum+=physic;
            numberOfLesson++;
        }

        System.out.print("Turkish Score: ");
        turkish = input.nextInt();

        if(turkish<0 || turkish >100){
            turkish = 0;
        }
        else {
            sum+=turkish;
            numberOfLesson++;
        }
        System.out.print("Chemistry Score: ");
        chem = input.nextInt();
        if(chem<0 || chem >100){
            chem = 0;
        }
        else {
            sum+=chem;
            numberOfLesson++;
        }

        System.out.print("Music Score: ");
        music = input.nextInt();
        if(music<0 || music >100){
            music = 0;
        }
        else {
            sum+=music;
            numberOfLesson++;
        }

        double average = sum / numberOfLesson;
        if(average >= 55){
            System.out.println("Well Done! You pass the class :)");
        }
        else {
            System.out.println("Sorry :( You cannot pass the class");
        }
        System.out.println("Your average: "+average);
    }
}