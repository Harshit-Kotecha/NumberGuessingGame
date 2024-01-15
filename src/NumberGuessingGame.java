import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        double rand = Math.random() * 100;
        int ans = (int) Math.round(rand);

        Scanner scanner = new Scanner(System.in);
        System.out.println(ans);
        System.out.println("Guess a number");
        int guess = scanner.nextInt();
scanner.nextLine();
        while (guess != ans) {
            if (guess < ans) {
                System.out.println("Choose a higher number");
            } else {
                System.out.println("Choose a lower number");
            }
            guess = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Yay! you guessed the correct number :)");
    }
}
