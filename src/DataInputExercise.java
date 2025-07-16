import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DataInputExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Integers Sum
        int x, y;
        try {
            System.out.print("Write an integer: ");
            x = sc.nextInt();
            System.out.print("Write another integer: ");
            y = sc.nextInt();

            System.out.print("The sum of the two integers are: " + (x + y));
        } catch (InputMismatchException ex){
            throw new IllegalArgumentException("ONLY INTEGERS NUMBERS ARE ACCEPTED!!");
        }
        */

        /*
            Discovering Circle Area

            double radius;
            try {

                System.out.print("Write the radius of an circle: ");
                radius = sc.nextDouble();

                double area = Math.PI * (radius * radius);

                System.out.printf("The circle area is: %.4f", area);

            } catch (InputMismatchException ex){
                throw new IllegalArgumentException("ONLY NUMBERS ARE ACCEPTED!!");
            }]
        */


    }
}
