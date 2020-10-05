package Week2;

import java.io.IOException;

class Help {
    void helpOn(int what) {
        switch (what) {
            default -> System.out.println("That's not a valid input...\n");
            case '1' -> System.out.println("Example:\n  if(condition) statement;\n  else if(condition) statement;\n  else statement;\n");
            case '2' -> System.out.println("Example:\n  switch(expression) {\n    case constant:\n      statement sequence\n      break;\n    // ...\n  }\n");
            case '3' -> System.out.println("Example:\n  for(init; condition; statement) {\n    statement;\n    // ...\n  }\n");
            case '4' -> System.out.println("Example:\n  while(condition) {\n    statement;\n    // ...\n  }\n");
            case '5' -> System.out.println("Example:\n  do {\n    statement;\n    // ...\n  } while(condition);\n");
            case '6' -> System.out.println("Example:\n  break;\n  // OR\n  break label;\n");
            case '7' -> System.out.println("Example:\n  continue;\n  // OR\n  continue label;\n");
        }
    }

    void showMenu() {
        System.out.println("What would you like help with?");
        System.out.println("  1: if");
        System.out.println("  2: switch");
        System.out.println("  3: for loop");
        System.out.println("  4: while loop");
        System.out.println("  5: do-while loop");
        System.out.println("  6: break");
        System.out.println("  7: continue\n");
        System.out.print("Please select one, or press q to quit: ");
    }

    boolean isValid(int ch) {
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}

public class HelpClassDemo {
    public static void main(String[] args)
            throws IOException {
        char choice, ignore;
        Help helpObj = new Help();

        for (; ; ) {
            do {
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (choice == 'q' || choice == 'Q') break;
                System.out.println("\n");
                if (helpObj.isValid(choice))
                    helpObj.helpOn(choice);
            } while (true);
        }
    }
}
