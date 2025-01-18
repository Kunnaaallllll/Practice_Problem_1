import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 10): ");
        int number = scanner.nextInt();

        String[] numberWords = {
            "One", "Two", "Three", "Four", "Five", 
            "Six", "Seven", "Eight", "Nine", "Ten"
        };

        if (number >= 1 && number <= 10) {
            System.out.println(numberWords[number - 1]);
        } else {
            System.out.println("Number out of range. Please enter a number between 1 and 10.");
        }

        scanner.close();
    }
}
