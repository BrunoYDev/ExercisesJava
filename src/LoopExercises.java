import java.util.Locale;
import java.util.Scanner;

public class LoopExercises {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Verify if a password is correct Loop While
            String password;

            System.out.print("Insert the password: ");
            password = sc.nextLine();

            while(!password.equals("2002")){
                System.out.println("Incorrect Password!");
                System.out.print("Try again: ");
                password = sc.nextLine();
            }

            System.out.println("Correct Password, you´re in :D ");
         */

        /* Receive two coordinates X and Y and give the quadrant of the point the cartesian plane
            int x = 1, y = 1;

            while(x != 0 && y != 0){
                System.out.print("Write an X position (e.g: 3): ");
                x = sc.nextInt();

                System.out.print("Write an Y position (e.g: 2): ");
                y = sc.nextInt();

                if(x > 0 && y > 0){
                    System.out.println("Second");
                }else if (x > 0 && y < 0){
                    System.out.println("Fourth");
                }else if (x < 0 && y > 0){
                    System.out.println("First");
                }else{
                    System.out.println("Third");
                }

            }
         */

    }
}
