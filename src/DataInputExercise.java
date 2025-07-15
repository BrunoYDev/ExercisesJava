import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInputExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x,y;

        try {
            System.out.print("Write an integer: ");
            x = sc.nextInt();
            System.out.print("Write another integer: ");
            y = sc.nextInt();

            System.out.print("The sum of the two integers are: " + (x + y));
        } catch (InputMismatchException ex){
            throw new IllegalArgumentException("ONLY INTEGERS NUMBERS ARE ACCEPTED!!");
        }
    }
}
