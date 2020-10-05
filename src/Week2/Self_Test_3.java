package Week2;

import java.util.Scanner;

public class Self_Test_3 {
    public static void main(String[] args) {
        // Chapter 3 - Self Test No. 9
        for (int i = 1; i < 1000000; i *= 2) System.out.print(i + "\t");

        // Chapter 3 - Self Test No. 10
        System.out.print("ASCII Case Converter: ");
        Scanner sc = new Scanner(System.in);
        final String input = sc.nextLine();
        var output = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i)))
                output.append(Character.toUpperCase(input.charAt(i)));
            else if (Character.isUpperCase(input.charAt(i)))
                output.append(Character.toLowerCase(input.charAt(i)));
            else
                output.append(input.charAt(i));
            if (input.charAt(i) != output.charAt(i))
                counter++;
            if (input.charAt(i) == '.')
                break;
        }
        System.out.println(output);
        System.out.println("Case changes: " + counter);
    }
}

