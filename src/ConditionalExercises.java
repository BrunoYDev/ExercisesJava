import java.util.Locale;
import java.util.Scanner;

public class ConditionalExercises {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Odds or Evens
            int num;

            System.out.print("Insert an integer number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                System.out.println("This number is an Odd Number!");
            }else{
                System.out.println("This number is an Even Number!");
            }
       */

        /* Discover if a number is multiple of another number
            int num1, num2;

            System.out.println("Discover if a number is multiple of another number.");

            System.out.print("Insert the first integer number: ");
            num1 = sc.nextInt();

            System.out.print("Insert the second integer number: ");
            num2 = sc.nextInt();

            if(num1 % num2 == 0 || num2 % num1 == 0){
                System.out.println("They are multiple!");
            }else{
                System.out.println("They aren't multiple!");
            }
         */

        /* Count the total time of a soccer match
            int initialHour, finalHour, duration;

            System.out.print("Insert the start hour of the game: ");
            initialHour = sc.nextInt();

            System.out.print("Insert the final hour of the game: ");
            finalHour = sc.nextInt();

            if(initialHour < finalHour){
                duration = finalHour - initialHour;
            }else{
                duration = (24 - initialHour) + finalHour;
            }

            System.out.println("The game total duration is: " + duration + "H");

         */
    }
}
