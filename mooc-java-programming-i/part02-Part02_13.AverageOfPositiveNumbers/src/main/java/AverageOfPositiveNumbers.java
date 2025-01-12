
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPositives = 0;
        int sumOfPositives = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                numberOfPositives = numberOfPositives + 1;
                sumOfPositives = sumOfPositives + input;
            }
        }

        if (numberOfPositives > 0) {
            System.out.println((double) sumOfPositives / numberOfPositives);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
