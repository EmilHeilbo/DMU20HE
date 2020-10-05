package Week3;

import java.util.Scanner;

public class StringContainerTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the string container.\n\nOptions:");
        var stringContainer = new StringContainer();
        stringContainer.strings = new String[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("1: Put. This method will ask for a string, then put it in a container.");
        System.out.println("2: Get. This method will ask for a number, then print the string in that position of the array.");
        System.out.println("3: Length. This method will return the amount of strings currently in use in the array.");
        System.out.println("4: Prints all used strings in array, in sequence.");
        EXIT:
        for (; ; ) {
            System.out.print("Please select which method you'd like to use, or press 0 to quit: ");
            int input = scan.nextInt();
            scan.nextLine();  //Catch LF character so it doesn't cause issues.
            switch (input) {
                case 1 -> {
                    System.out.print("Please enter a string to store in the array: ");
                    stringContainer.put(scan.nextLine());
                }
                case 2 -> {
                    System.out.print("Please enter the position of the array you'd like to read: ");
                    System.out.println(stringContainer.get(scan.nextInt()));
                    scan.nextLine();
                }
                case 3 -> System.out.println(stringContainer.length());
                // Extra functions, just for fun
                case 4 -> {
                    for (String str : stringContainer.strings)
                        if (str != null)
                            System.out.println(str);
                }
                case 0 -> {
                    break EXIT;
                }
                default -> System.out.println("Invalid input, please try again.");
            }
        }
    }
}
