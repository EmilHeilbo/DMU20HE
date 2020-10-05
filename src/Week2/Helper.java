package Week2;

import java.io.IOException;

public class Helper {
    public static void main(String[] args)
            throws IOException {
        char input, ignore;
        for (; ; ) {
            do {
                System.out.print("Which would you like help on?\n  1: if\n  2: switch\n  3: for loop\n  4: while loop\n  5: do-while loop\n  6: break\n  7: continue\n");
                System.out.print("Please select one, or press q to quit: ");

                input = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (input < '1' | input > '7' & input != 'q' & input != 'Q');
            if (input == 'q' || input == 'Q')
                break;
            switch (input) {
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
    }
}
