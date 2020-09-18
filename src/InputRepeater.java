import java.io.IOException;
import java.util.Scanner;

public class InputRepeater {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write a string, followed by pressing ENTER: ");
        String s = sc.nextLine();
        switch (s) {
            default -> System.out.println("\"" + s + "\" is not a quote I recognize... yet ;)");
            case "It's over Anakin!" -> System.out.println("I have the high ground! You were the chosen one! You were supposed to fight the Sith, not join them!");
            case "I don't like sand." -> System.out.println("It's coarse and rough and irritating--not like you. You're soft and smooth.");
        }
    }
}
