package lab2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // ----------------------------------------------------
        // Part 2: Interface reference typing
        // ----------------------------------------------------
        // YES, changing the reference type to Counter IS allowed.
        // Reason: WordProcessor implements Counter, satisfying the IS-A relationship 
        // through polymorphism.
        Counter wpCounter = new WordProccessor();

        System.out.println("\n--- Testing User Input via Counter reference ---");
        System.out.println("Word count: " + wpCounter.countWords(userInput));
        System.out.println("Letter count: " + wpCounter.countLetters(userInput));
        System.out.println("Total length: " + wpCounter.getLength(userInput));

        // ----------------------------------------------------
        // Part 3: Fall-back text & Datatype analysis
        // ----------------------------------------------------
        WordProccessor processor = new WordProccessor("Default fall-back text for testing.");

        System.out.println("\n--- Testing Null Inputs (Triggers Fall-Back) ---");
        System.out.println("Word count (null): " + processor.countWords(null));
        System.out.println("Letter count (null): " + processor.countLetters(null));
        System.out.println("Total length (null): " + processor.getLength(null));

        scanner.close();
    }
}