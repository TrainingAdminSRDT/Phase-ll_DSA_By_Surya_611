import java.util.Scanner;

public class day_predictor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for day: ");
        int a = input.nextInt();
        input.close();

        if (a == 1) {
            System.out.println("a is Monday");
        } else if (a == 2) {
            System.out.println("a is Tuesday");
        } else if (a == 3) {
            System.out.println("a is Wednesday");
        } else if (a == 4) {
            System.out.println("a is Thursday");
        } else if (a == 5) {
            System.out.println("a is Friday");
        } else if (a == 6) {
            System.out.println("a is Saturday");
        } else if (a == 7) {
            System.out.println("a is Sunday");
        } else {
            System.out.println("Invalid day number");
        }
    }
}