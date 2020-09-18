import java.util.Scanner;

public class Self_Test_3 {
    public static void main (String[] args) {
        // Chapter 3 - Self Test No. 9
        for (int i=1; i<1000000; i *= 2) System.out.print(i + "\t");

        // Chapter 3 - Self Test No. 10
        System.out.print("ASCII Case Converter: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(), output = "";
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            //Mere simpelt og fungerer bedre, da forskellen på 32 ikke gælder for alle bogstaver i Extended ASCII:
            /*if (Character.isLowerCase(input.charAt(i)))
                output += Character.toUpperCase(input.charAt(i));
            else if (Character.isUpperCase(input.charAt(i)))
                output += Character.toLowerCase(input.charAt(i));
            else
                output += input.charAt(i);*/
            //Og her er den "rigtige" løsning, dvs. det opgaven hentyder til vi skal:
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z')
                output += (char) (input.charAt(i) - 32);
            else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z')
                output += (char) (input.charAt(i) + 32);
            else
                output += input.charAt(i);
            if (output.charAt(i) != input.charAt(i))
                counter++;
            if (input.charAt(i) == '.')
                break;
        }
        System.out.println(output);
        System.out.println("Case changes: " + counter);
    }
}

